package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethods {
  public static final String[][] stocks = new String[][]{
      // without Ticker symbol
      new Stock("Tesla", 200.50).toArray(),
      new Stock("Apple", 985.00).toArray(),
      new Stock("Microsoft", 240.35).toArray(),
      new Stock("Facebook", 300.00).toArray(),
      new Stock("Ubisoft", 15.00).toArray(),
      new Stock("Blizzard", 95.50).toArray(),
      new Stock("Google", 2005.00).toArray(),
      new Stock("EA", 140.00).toArray(),
      new Stock("IBM", 133.00).toArray(),
      new Stock("Pied Piper", 0.07).toArray(),
      new Stock("Aviato", 12.50).toArray(),
      // with Ticker symbol
      new Stock("AT&T", "T", 30.47).toArray(),
      new Stock("Home Depot Inc", "HD", 307.75).toArray(),
      new Stock("Johnson & Johnson", "JNJ", 160.00).toArray(),
      new Stock("Ford Motor Company", "F", 12.00).toArray(),
      new Stock("Costco Wholesale", "COST", 355.00).toArray(),
      new Stock("Citigroup", "C", 73.00).toArray(),
      new Stock("Dell Technologies", "DELL", 90.00).toArray(),
  };

  /**
   * Finds the price of a stock. Returns -1 if stock not found
   */
  public static double findStockPrice(String stockName) {
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

  public static List<?> removeEmpty(List<?> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == null) {
        list.remove(i);
        i--;
      }
    }

    return list;
  }
}
