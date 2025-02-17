package org.karane.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {

    @Test
    void testWithdrawWithInsufficientFunds() {
        BankAccount account = new BankAccount(50);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });

        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });

        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(200);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30);
        });

        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
