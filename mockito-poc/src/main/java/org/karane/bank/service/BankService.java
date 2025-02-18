package org.karane.bank.service;

import org.karane.bank.model.Account;
import org.karane.bank.repository.AccountRepository;
import org.karane.bank.util.AuditLogger;

public class BankService {
    private final AccountRepository accountRepository;
    private final NotificationService notificationService;
    private final TransactionManager transactionManager;

    public BankService(AccountRepository accountRepository, 
                       NotificationService notificationService,
                       TransactionManager transactionManager) {
        this.accountRepository = accountRepository;
        this.notificationService = notificationService;
        this.transactionManager = transactionManager;
    }

    public void withdraw(String accountId, double amount) {
        Account account = accountRepository.findById(accountId);
        transactionManager.processWithdrawal(account, amount);
        accountRepository.save(account);
        notificationService.sendNotification("Withdrawal of " + amount + " from " + account.getOwner());

        // New static method call
        AuditLogger.log("Withdrawal: " + amount + " from " + account.getId());
    }
}
