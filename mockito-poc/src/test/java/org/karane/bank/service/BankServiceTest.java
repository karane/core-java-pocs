package org.karane.bank.service;

import org.karane.bank.model.Account;
import org.karane.bank.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.karane.bank.util.AuditLogger;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // Enables Mockito with JUnit 5
class BankServiceTest {
    
    @Mock private AccountRepository accountRepository; // Mocking a dependency
    @Mock private NotificationService notificationService; // Mocking a dependency
    @Spy private TransactionManager transactionManager; // Using a spy for partial mocking
    
    private BankService bankService;

    @BeforeEach
    void setUp() {
        // Injecting mocks into BankService
        bankService = new BankService(accountRepository, notificationService, transactionManager);
    }

    @Test
    void testWithdraw_Success() {
        // MOCKING: Define behavior of mock (Stubbing)
        Account account = new Account("123", "John Doe", 1000.0);
        when(accountRepository.findById("123")).thenReturn(account); 

        // ACT: Call the method under test
        bankService.withdraw("123", 200.0);

        // VERIFYING: Ensure methods were called with expected values
        verify(transactionManager).processWithdrawal(account, 200.0); // Verifies withdrawal process
        verify(accountRepository).save(account); // Verifies account update
        verify(notificationService).sendNotification("Withdrawal of 200.0 from John Doe"); // Verifies notification sent

        // ASSERT: Validate state change
        assertEquals(800.0, account.getBalance()); 
    }

    @Test
    void testWithdraw_InsufficientFunds() {
        // MOCKING: Stub a method to return a specific account
        Account account = new Account("123", "John Doe", 100.0);
        when(accountRepository.findById("123")).thenReturn(account);

        // ASSERT: Verify exception is thrown for insufficient funds
        assertThrows(IllegalArgumentException.class, () -> bankService.withdraw("123", 200.0));

        // VERIFY: Ensure accountRepository and notificationService are never called
        verify(accountRepository, never()).save(any(Account.class));
        verify(notificationService, never()).sendNotification(anyString());
    }

    @Test
    void testArgumentCaptor() {
        // MOCKING: Stub method to return an account
        ArgumentCaptor<Double> captor = ArgumentCaptor.forClass(Double.class);
        Account account = new Account("123", "John Doe", 500.0);
        when(accountRepository.findById("123")).thenReturn(account);

        // ACT: Perform withdrawal
        bankService.withdraw("123", 100.0);

        // CAPTURING ARGUMENTS: Capture the argument passed to processWithdrawal
        verify(transactionManager).processWithdrawal(eq(account), captor.capture());
        
        // ASSERT: Validate captured argument
        assertEquals(100.0, captor.getValue());
    }

    @Test
    void testMockStaticMethod() {
        // MOCKING STATIC METHOD: Mocking static call for logging
        try (MockedStatic<AuditLogger> mockedLogger = mockStatic(AuditLogger.class)) {
            Account account = new Account("123", "John Doe", 1000.0);
            when(accountRepository.findById("123")).thenReturn(account);

            // ACT: Perform withdrawal
            bankService.withdraw("123", 200.0);

            // VERIFY: Ensure static method was called
            mockedLogger.verify(() -> AuditLogger.log("Withdrawal: 200.0 from 123"));
        }
    }

    @Test
    void testMockFinalClass() {
        // MOCKING FINAL CLASS: Creating a mock for a final class
        TransactionManager mockTransactionManager = mock(TransactionManager.class);

        // STUBBING: Prevent actual method execution
        doNothing().when(mockTransactionManager).processWithdrawal(any(), anyDouble());

        Account account = new Account("123", "John Doe", 1000.0);

        // ACT: Perform withdrawal
        mockTransactionManager.processWithdrawal(account, 500.0);

        // VERIFY: Ensure method was called
        verify(mockTransactionManager).processWithdrawal(account, 500.0);
    }

    @Test
    void testCustomAnswer() {
        // MOCKING WITH CUSTOM ANSWER: Returning a dynamically created object
        when(accountRepository.findById(anyString())).thenAnswer(invocation -> {
            String accountId = invocation.getArgument(0);
            return new Account(accountId, "John Doe", 1000.0);
        });

        // ACT: Retrieve account
        Account result = accountRepository.findById("123");

        // ASSERT: Verify that the returned object has expected properties
        assertNotNull(result);
        assertEquals("123", result.getId());
    }

    @Test
    void testVerifyWithTimeout() {
        // MOCKING: Stub account repository response
        when(accountRepository.findById("123")).thenReturn(new Account("123", "John Doe", 1000.0));

        // ACT: Perform withdrawal
        bankService.withdraw("123", 200.0);

        // VERIFY WITH TIMEOUT: Ensure method is called within 100ms
        verify(notificationService, timeout(100)).sendNotification(anyString());
    }

    @Test
    void testResetMocks() {
        // MOCKING: Stub method to return an account
        when(accountRepository.findById("123")).thenReturn(new Account("123", "John Doe", 1000.0));

        // ACT: Perform withdrawal
        bankService.withdraw("123", 200.0);

        // RESETTING MOCKS: Clear all interactions
        reset(accountRepository, notificationService);

        // VERIFY: No interactions should be recorded after reset
        verify(accountRepository, never()).findById(anyString());
    }
}
