package com.teamplusplus.bankplusplus.crypto;

public class Crypto {
    private final int[] keys;

    public Crypto(int[] keys) {
        this.keys = keys;
    }

    public byte[] encrypt(byte[] data) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            enc[i] = (byte) ((i % keys[0] == 0) ? data[i] + keys[1] : data[i] - keys[2]);
        }
        return enc;
    }

    public byte[] decrypt(byte[] data) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            enc[i] = (byte) ((i % keys[0] == 0) ? data[i] - keys[1] : data[i] + keys[2]);
        }
        return enc;
    }
}
