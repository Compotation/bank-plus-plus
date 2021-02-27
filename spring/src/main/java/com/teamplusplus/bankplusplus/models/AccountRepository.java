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

  public Account getAccount(int id) {
    return accounts.get(id);
  }
}
