package org.karane.bank.repository;

import org.karane.bank.model.Account;

public interface AccountRepository {
    Account findById(String accountId);
    void save(Account account);
}
