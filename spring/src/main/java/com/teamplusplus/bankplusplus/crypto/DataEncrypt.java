package com.teamplusplus.bankplusplus.crypto;

import com.teamplusplus.bankplusplus.models.Account;

import java.util.HashMap;
import java.util.Map;

public class DataEncrypt {
  private final Crypto crypto;

  public DataEncrypt(Crypto crypto) {
    this.crypto = crypto;
  }

  public Map<String, String> encryptAccount(Account account) {
    return new HashMap<>() {
      {
        put("transactions", crypto.encrypt(account.getTransactions().toString()));
        put("name", crypto.encrypt(account.getName()));
        put("balance", crypto.encrypt(account.getBalance()));
        put("id", crypto.encrypt(account.getId().toString()));
      }
    };
  }

  public Map<String, String> decryptAccount(Map<String, String> encryptedAccount) {
    Map<String, String> accountMap = new HashMap<>();
    encryptedAccount.forEach((key, value) -> accountMap.put(key, crypto.decrypt(value)));
    return accountMap;
  }
}
