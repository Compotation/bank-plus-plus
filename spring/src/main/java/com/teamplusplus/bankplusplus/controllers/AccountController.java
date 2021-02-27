package com.teamplusplus.bankplusplus.controllers;

import com.teamplusplus.bankplusplus.models.Account;
import com.teamplusplus.bankplusplus.models.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
  private final AccountRepository accountRepository;

  public AccountController(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @GetMapping("/accounts")
  public List<Account> listAccounts() {
    return accountRepository.getAccounts();
  }
}
