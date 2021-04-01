package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;

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

  public static ArrayList columnMajor(String[][] stocks) {
    ArrayList output = new ArrayList<>();
    for (int j = 0; j < 3; j++) {
      for (int k = 0; k < stocks.length; k++) {
        output.add(stocks[k][j]);
      }
    }

    return output;
  }
}
