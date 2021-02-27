package com.teamplusplus.bankplusplus.crypto;

public class CyptoMain {

    public static void main(String[] args) {
        Crypto crypto = new Crypto();

        String data = "Quincy Holmer"; // modify data here

        String enc = new String(crypto.encrypt(data.getBytes(), 1, 1, 1));
        String dec = new String(crypto.decrypt(enc.getBytes(), 1, 1, 1));

        System.out.println("Original  : " + data);
        System.out.println("Encrypted : " + enc);
        // dec should be the same as data
        System.out.println("Decrypted : " + dec);

    }

}
