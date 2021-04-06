package com.teamplusplus.bankplusplus.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethods {
  public static final String[][] stocks = new String[][]{
      // without Ticker symbol
      new Stock("Tesla", 690.00, 0.02).toArray(),
      new Stock("Apple", 126.00, 0.01).toArray(),
      new Stock("Microsoft", 240.35, 0.03).toArray(),
      new Stock("Facebook", 300.00, 0.02).toArray(),
      new Stock("Ubisoft", 15.00, 0.01).toArray(),
      new Stock("Blizzard", 95.50, 0.02).toArray(),
      new Stock("Google", 2005.00, 0.09).toArray(),
      new Stock("EA", 140.00, 0.01).toArray(),
      new Stock("IBM", 133.00, 0.01).toArray(),
      new Stock("Pied Piper", 0.07, 2.6).toArray(),
      new Stock("Aviato", 12.50, 0.01).toArray(),
      // with Ticker symbol
      new Stock("AT&T", "T", 30.47, 0.01).toArray(),
      new Stock("Home Depot Inc", "HD", 307.75, 0.01).toArray(),
      new Stock("Johnson & Johnson", "JNJ", 160.00, 0.02).toArray(),
      new Stock("Ford Motor Company", "F", 12.00, 0.01).toArray(),
      new Stock("Costco Wholesale", "COST", 355.00, 0.01).toArray(),
      new Stock("Citigroup", "C", 73.00, 0.01).toArray(),
      new Stock("Dell Technologies", "DELL", 90.00, 0.01).toArray(),
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
  public static void stockUpdate(String[][] stockList) {
    for (int i = 0; i < stockList.length; i++) {
      stockList[i][2] = (Math.random() < 0.5) ? stockList[i][2]*(1+stockList[i][3]) : stockList[i][2]*(1-stockList[i][3])
    }
  }
}
