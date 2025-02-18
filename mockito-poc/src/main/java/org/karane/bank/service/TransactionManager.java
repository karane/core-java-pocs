package org.karane.bank.service;

import org.karane.bank.model.Account;

public final class TransactionManager {
    public void processWithdrawal(Account account, double amount) {
        account.withdraw(amount);
    }
}
