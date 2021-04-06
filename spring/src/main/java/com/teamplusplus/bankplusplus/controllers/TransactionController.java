package com.teamplusplus.bankplusplus.controllers;

import com.teamplusplus.bankplusplus.models.AccountRepository;
import com.teamplusplus.bankplusplus.models.ArrayMethods;
import com.teamplusplus.bankplusplus.validators.BuyConstraint;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@Validated
public class TransactionController {
  private final AccountRepository accountRepository;

  public TransactionController(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @PostMapping("/{accountId}/transactions")
  @BuyConstraint
  public void buy(@PathVariable String accountId, @RequestParam String stock, @RequestParam @Min(1) int quantity) {
    accountRepository.getAccount(accountId).buyStock(stock, ArrayMethods.findStockPrice(stock), quantity);
  }

  @PostMapping("/{accountId}/deposits")
  public void deposit(@PathVariable String accountId, @RequestParam double amount) {
    accountRepository.getAccount(accountId).depositMoney(amount);
  }

  @GetMapping("/stocks")
  public String[][] getStocks() {
    return ArrayMethods.stocks;
  }
}
