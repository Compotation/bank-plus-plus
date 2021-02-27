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

  public List<Transaction> getTransactionList() {
    return transactionList;
  }

  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public int numberOfTransactions() {
    return transactionList.size();
  }

  public void buyStock(String stockName) {
    transactionList.add(0, new Transaction(stockName));
  }
}