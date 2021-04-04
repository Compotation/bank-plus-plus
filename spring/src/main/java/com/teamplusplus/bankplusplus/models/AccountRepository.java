package com.teamplusplus.bankplusplus.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountRepository {
  private final List<Account> accounts;

  public AccountRepository() {
    this.accounts = new ArrayList<>();
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void addAccount(String name) {
    accounts.add(new Account(name));
  }

  public void addAccount(String name, double startingBalance) {
    accounts.add(new Account(name, startingBalance));
  }

  public Account getAccount(String id) {
    for (Account account : accounts) {
      if (account.getId().toString().equals(id)) {
        return account;
      }
    }
    return null;
  }
}
