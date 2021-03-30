package com.teamplusplus.bankplusplus.controllers;

import com.teamplusplus.bankplusplus.crypto.Crypto;
import com.teamplusplus.bankplusplus.crypto.DataEncrypt;
import com.teamplusplus.bankplusplus.models.Account;
import com.teamplusplus.bankplusplus.models.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
  private final AccountRepository accountRepository;
  private final DataEncrypt dataEncrypt;

  public AccountController(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
    this.dataEncrypt = new DataEncrypt(new Crypto(new int[]{(int) (Math.random() * 40), (int) (Math.random() * 99), (int) (Math.random() * 50)}));
  }

  @GetMapping("/accounts")
  public List<Account> listAccounts() {
    return accountRepository.getAccounts();
  }

  @PostMapping("/accounts")
  public void addAccount(@RequestParam String name) {
    accountRepository.addAccount(name);
  }

  @GetMapping("/export")
  public List<Map<String, String>> encryptExport() {
    List<Map<String, String>> export = new ArrayList<>();
    accountRepository.getAccounts().forEach(account -> export.add(dataEncrypt.encryptAccount(account)));
    return export;
  }
}
