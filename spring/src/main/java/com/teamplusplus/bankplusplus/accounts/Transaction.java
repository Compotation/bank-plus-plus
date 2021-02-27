package com.teamplusplus.bankplusplus.accounts;

import java.time.LocalDateTime;

public class Transaction {
  private final LocalDateTime date;
  private final Double amount;
  private final String merchant;

  public Transaction(Double amount, String merchant) {
    this.date = LocalDateTime.now();
    this.amount = amount;
    this.merchant = merchant;
  }
}
