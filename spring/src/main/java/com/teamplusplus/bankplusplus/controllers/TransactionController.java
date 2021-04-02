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
    stocks = new String[][]{new Stock("Tesla", 200.50).toArray(), new Stock("Apple", 985).toArray()};
  }

  @PostMapping("/{accountId}/transactions")
  public void addTransaction(@PathVariable String accountId, @RequestParam String stock) {
    accountRepository.getAccount(accountId).buyStock(stock, ArrayMethods.findStockPrice(stocks, stock));
  }

  @GetMapping("/stocks")
  public String[][] getStocks() {
    return stocks;
  }
}
