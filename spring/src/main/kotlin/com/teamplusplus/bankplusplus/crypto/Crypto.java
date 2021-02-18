package com.teamplusplus.bankplusplus.crypto;

public class Crypto implements CryptoInterface {

    public byte[] encrypt(byte[] data, int keyOne, int keyTwo, int keyThree) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++){
            enc[i] = (byte)((i % keyOne == 0) ? data[i] + keyTwo : data[i] - keyThree);
        }
        return enc;
    }

    public byte[] decrypt(byte[] data, int keyOne, int keyTwo, int keyThree) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++){
            enc[i] = (byte)((i % keyOne == 0) ? data[i] - keyTwo : data[i] + keyThree);
        }
        return enc;
    }
}
