package com.teamplusplus.bankplusplus.crypto;

public interface CryptoInterface {
    byte[] encrypt(byte[] data, int keyOne, int keyTwo, int keyThree);

    byte[] decrypt(byte[] data, int keyOne, int keyTwo, int keyThree);
}
