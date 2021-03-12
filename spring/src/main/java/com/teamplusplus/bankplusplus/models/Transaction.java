package com.teamplusplus.bankplusplus.models;

import java.time.LocalDateTime;

public class Transaction {
  private final LocalDateTime date;
  private final Double amount;

  public Transaction(double amount) {
    this.date = LocalDateTime.now();
    this.amount = amount;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public Double getAmount() {
    return amount;
  }
}
