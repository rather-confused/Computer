package module2_5;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        CaesarCipher shift1 = new CaesarCipher(1);
        String encryptedMessageShift1 = shift1.encrypt("defend the east wall of the castle");
        System.out.println(encryptedMessageShift1);
        String decryptedMessageShift1 = shift1.decrypt(encryptedMessageShift1);
        System.out.println(decryptedMessageShift1);

        CaesarCipher shift3 = new CaesarCipher(10);
        String encryptedMessageShift3 = shift3.encrypt("I like eating Bananas and Apples");
        System.out.println(encryptedMessageShift3);
        String decryptedMessageShift3 = shift3.decrypt(encryptedMessageShift3);
        System.out.println(decryptedMessageShift3);
    }
}