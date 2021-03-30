package com.teamplusplus.bankplusplus.models;

public class StockTransaction extends Transaction {
  private final String stock;

  public StockTransaction(String stock, double amount) {
    super(amount);
    this.stock = stock;
  }

  public String getStock() {
    return stock;
  }
}
