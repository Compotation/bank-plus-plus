package com.teamplusplus.bankplusplus.models;

import java.time.LocalDateTime;

public class Transaction {
  private final LocalDateTime date;
  private final Double amount;
  private final String stock;

  public Transaction(Double amount, String stock) {
    this.date = LocalDateTime.now();
    this.amount = amount;
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
