package org.karane.bank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class ParameterizedTests {

    /**
     * Test valid deposit amounts using @ValueSource
     */
    @ParameterizedTest
    @ValueSource(doubles = {50.0, 100.0, 500.0, 1000.0})
    void testValidDeposits(double amount) {
        BankAccount account = new BankAccount(0);
        account.deposit(amount);
        assertEquals(amount, account.getBalance());
    }

    /**
     * Test invalid deposit amounts (zero or negative) using @ValueSource
     */
    @ParameterizedTest
    @ValueSource(doubles = {0.0, -10.0, -100.0})
    void testInvalidDeposits(double amount) {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(amount));
    }

    /**
     * Test valid withdrawals using @CsvSource
     */
    @ParameterizedTest
    @CsvSource({
        "200, 50, 150", 
        "500, 100, 400", 
        "1000, 500, 500"
    })
    void testValidWithdrawals(double initialBalance, double withdrawAmount, double expectedBalance) {
        BankAccount account = new BankAccount(initialBalance);
        account.withdraw(withdrawAmount);
        assertEquals(expectedBalance, account.getBalance());
    }

    /**
     * Test insufficient funds scenario using @CsvSource
     */
    @ParameterizedTest
    @CsvSource({
        "50, 100",
        "200, 300",
        "0, 50"
    })
    void testInsufficientFunds(double initialBalance, double withdrawAmount) {
        BankAccount account = new BankAccount(initialBalance);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(withdrawAmount));
    }

    /**
     * Test multiple account balances using @MethodSource
     */
    @ParameterizedTest
    @MethodSource("balanceProvider")
    void testAccountBalances(double initialBalance, boolean expectedStatus) {
        BankAccount account = new BankAccount(initialBalance);
        assertEquals(expectedStatus, account.getBalance() > 0);
    }

    static Stream<Arguments> balanceProvider() {
        return Stream.of(
            Arguments.of(100.0, true),
            Arguments.of(0.0, false),
            Arguments.of(500.0, true),
            Arguments.of(-50.0, false)
        );
    }
}
