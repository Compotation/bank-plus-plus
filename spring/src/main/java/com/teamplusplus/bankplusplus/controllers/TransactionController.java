package com.teamplusplus.bankplusplus.controllers;

import com.teamplusplus.bankplusplus.models.AccountRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransactionController {
  private final AccountRepository accountRepository;

  public TransactionController(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @GetMapping("/{accountId}/transactions/amount")
  public int showAmountOfTransactions(@PathVariable int accountId) {
    return accountRepository.getAccount(accountId).numberOfTransactions();
  }

  @PostMapping("/{accountId}/transactions")
  public void addTransaction(@PathVariable int accountId, @RequestParam String stock) {
    accountRepository.getAccount(accountId).buyStock(stock);
  }
}
