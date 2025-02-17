package org.karane.bank;

import java.util.List;

public class BankService {
    public double getTotalBalance(List<BankAccount> accounts) {
        return accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
