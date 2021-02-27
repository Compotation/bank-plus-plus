package com.teamplusplus.bankplusplus.accounts;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private final List<Transaction> transactionList;
  private final String name;
  private final Double balance;

  public Account(String name, Double balance) {
    this.name = name;
    this.balance = balance;
    this.transactionList = new ArrayList<>();
  }
}