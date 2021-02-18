package com.teamplusplus.bankplusplus.crypto;

public interface CryptoInterface {
    byte[] encrypt(byte[] data);

    byte[] decrypt(byte[] data);
}
