package com.teamplusplus.bankplusplus.models;

public class ArrayMethods {
  /**
   * Finds the price of a stock. Returns -1 if stock not found
   */
  public static double findStockPrice(String[][] stocks, String stockName) {
    for (String[] stock : stocks) {
      if (stock[1].equals(stockName)) {
        return Double.parseDouble(stock[2]);
      }
    }

    return -1;
  }
}
