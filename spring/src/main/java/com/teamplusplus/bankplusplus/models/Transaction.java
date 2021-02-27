package com.teamplusplus.bankplusplus.models;

import java.time.LocalDateTime;

public class Transaction {
  private final LocalDateTime date;
  private final Double amount;
  private final String stock;

  public Transaction(String stock) {
    this.date = LocalDateTime.now();
    // TODO lookup stock price
    this.amount = 0.0;
    this.stock = stock;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public Double getAmount() {
    return amount;
  }

  public String getStock() {
    return stock;
  }
}
