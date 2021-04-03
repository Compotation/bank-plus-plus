package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
  private final List<Transaction> transactions;
  private final String name;
  private Double balance;
  private final UUID id;

  public Account(String name) {
    this.name = name;
    this.balance = 0.0;
    this.transactions = new ArrayList<>();
    this.id = UUID.randomUUID();
  }

  public List<Transaction> getTransactions() {
    return transactions;
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
    return transactions.size();
  }

  public void buyStock(String stockName, double stockPrice) {
    if ((balance - stockPrice) > 0) {
      balance -= stockPrice;
      transactions.add(0, new StockTransaction(stockName, stockPrice));
    }
  }

  public void depositMoney(double amount) {
    transactions.add(0, new Transaction(amount));
  }
}