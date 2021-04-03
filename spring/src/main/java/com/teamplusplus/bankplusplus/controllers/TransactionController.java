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
                            new Stock("Apple", 985).toArray(),
                            new Stock("Microsoft", 240.35).toArray(),
                            new Stock("Facebook", 300).toArray(),
                            new Stock("Ubisoft", 15).toArray(),
                            new Stock("Blizzard", 95.5).toArray(),
                            new Stock("Google", 2005).toArray(),
                            new Stock("EA", 140).toArray(),
                            new Stock("IBM", 133).toArray(),
                            new Stock("Pied Piper", 0.07).toArray(),
                            new Stock("Aviato", 12.5).toArray(),
                            // with Ticker symbol
                            new Stock("AT&T", "T", 30.47).toArray(),
                            new Stock("Home Depot Inc", "HD", 307.75).toArray(),
                            new Stock("Johnson & Johnson", "JNJ", 160).toArray(),
                            new Stock("Ford Motor Company", "F", 12).toArray(),
                            new Stock("Costco Wholesale", "COST", 355).toArray(),
                            new Stock("Citigroup", "C", 73).toArray(),
                            new Stock("Dell Technologies", "DELL", 90).toArray(),
                            };
  }

  @GetMapping("/{accountId}/transactions/amount")
  public int showAmountOfTransactions(@PathVariable int accountId) {
    return accountRepository.getAccount(accountId).numberOfTransactions();
  }

  @PostMapping("/{accountId}/transactions")
  public void addTransaction(@PathVariable int accountId, @RequestParam String stock) {
    accountRepository.getAccount(accountId).buyStock(stock, ArrayMethods.findStockPrice(stocks, stock));
  }

  @GetMapping("/stocks")
  public String[][] getStocks() {
    return stocks;
  }
}
