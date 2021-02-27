package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private final List<Transaction> transactionList;
  private final String name;
  private final Double balance;

  public Account(String name) {
    this.name = name;
    this.balance = 0.0;
    this.transactionList = new ArrayList<>();
  }
}