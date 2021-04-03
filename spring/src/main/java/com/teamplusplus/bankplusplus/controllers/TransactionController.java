package com.teamplusplus.bankplusplus.controllers;

import com.teamplusplus.bankplusplus.models.AccountRepository;
import com.teamplusplus.bankplusplus.models.ArrayMethods;
import com.teamplusplus.bankplusplus.models.Stock;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
  private final AccountRepository accountRepository;
  private final String[][] stocks;

  public TransactionController(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
    stocks = new String[][]{
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
  }

  @PostMapping("/{accountId}/transactions")
  public void buy(@PathVariable String accountId, @RequestParam String stock) {
    accountRepository.getAccount(accountId).buyStock(stock, ArrayMethods.findStockPrice(stocks, stock));
  }

  @GetMapping("/stocks")
  public String[][] getStocks() {
    return stocks;
  }
}
