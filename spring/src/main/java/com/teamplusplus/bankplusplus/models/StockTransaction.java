package com.teamplusplus.bankplusplus.models;

public class StockTransaction extends Transaction {
  private final String stock;
  private int quantity;

  public StockTransaction(String stock, double amount) {
    super(amount);
    this.stock = stock;
    this.quantity = 1;
  }

  public StockTransaction(String stock, double amount, int quantity) {
    this(stock, amount);
    this.quantity = quantity;
  }

  public String getStock() {
    return stock;
  }

  public int getQuantity() {
    return quantity;
  }
}
