package com.teamplusplus.bankplusplus.models;

public class StockTransaction extends Transaction {
  private final String stock;

  public StockTransaction(String stock) {
    // TODO lookup stock price
    super(-1.0);
    this.stock = stock;
  }

  public String getStock() {
    return stock;
  }
}
