package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
  private final List<Transaction> transactionList;
  private final String name;
  private final Double balance;
  private final UUID id;

  public Account(String name) {
    this.name = name;
    this.balance = 0.0;
    this.transactionList = new ArrayList<>();
    this.id = UUID.randomUUID();
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

  public UUID getId() {
    return id;
  }

  public int numberOfTransactions() {
    return transactionList.size();
  }

  public void buyStock(String stockName, double stockPrice) {
    transactionList.add(0, new StockTransaction(stockName, stockPrice));
  }

  public void depositMoney(double amount) {
    transactionList.add(0, new Transaction(amount));
  }
}