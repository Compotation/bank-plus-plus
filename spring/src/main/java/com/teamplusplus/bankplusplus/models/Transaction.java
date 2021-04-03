package com.teamplusplus.bankplusplus.models;

import java.time.LocalDateTime;

public class Transaction {
  private final LocalDateTime date;
  private final double amount;

  public Transaction(double amount) {
    this.date = LocalDateTime.now();
    this.amount = amount;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public double getAmount() {
    return amount;
  }

  public String toString() {
    return date.toLocalDate().toString() + ", " + amount;
  }
}
