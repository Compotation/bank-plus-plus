
// Insert package above

public class Crypto implements CryptoInterface {

    public byte[] encrypt(byte[] data) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++){
            enc[i] = (byte)((i % 3 == 0) ? data[i] + 7 : data[i] - 5);
        }
        return enc;
    }

    public byte[] decrypt(byte[] data) {
        byte[] enc = new byte[data.length];

        for (int i = 0; i < data.length; i++){
            enc[i] = (byte)((i % 3 == 0) ? data[i] - 7 : data[i] + 5);
        }
        return enc;
    }
}
