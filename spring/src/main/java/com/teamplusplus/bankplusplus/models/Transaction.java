package com.teamplusplus.bankplusplus.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
  private final LocalDateTime date;
  private final double amount;

  public Transaction(double amount) {
    this.date = LocalDateTime.now();
    this.amount = amount;
  }

  public String getDate() {
    return date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm"));
  }

  public double getAmount() {
    return amount;
  }

  public String toString() {
    return date.toLocalDate().toString() + ", " + amount;
  }
}
