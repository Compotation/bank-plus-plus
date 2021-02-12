
// Insert package above

public class CyptoMain {

    public static void main(String[] args) {
        Crypto crypto = new Crypto();

        String data = ""; // modify data here

        String enc = new String(crypto.encrypt(data.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));

        System.out.println("Original  : " + data);
        System.out.println("Encrypted : " + enc);
        // dec should be the same as data
        System.out.println("Decrypted : " + dec);

    }

}
