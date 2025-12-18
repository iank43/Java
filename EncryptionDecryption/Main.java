// Simple 3-Level Encryption and Decryption
// Level 1: Caesar Cipher (+3)
// Level 2: Reverse Text
// Level 3: ASCII Manipulation (+2)

import java.io.FileWriter;

public class Main {

    // -------- ENCRYPTION METHODS --------

    static String caesarEncrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result = result + (char)('A' + (c - 'A' + 3) % 26);
            } else if (c >= 'a' && c <= 'z') {
                result = result + (char)('a' + (c - 'a' + 3) % 26);
            } else {
                result = result + c;
            }
        }
        return result;
    }

    static String reverseText(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

    static String asciiEncrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = result + (char)(text.charAt(i) + 2);
        }
        return result;
    }

    // -------- DECRYPTION METHODS --------

    static String asciiDecrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result = result + (char)(text.charAt(i) - 2);
        }
        return result;
    }

    static String caesarDecrypt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result = result + (char)('A' + (c - 'A' - 3 + 26) % 26);
            } else if (c >= 'a' && c <= 'z') {
                result = result + (char)('a' + (c - 'a' - 3 + 26) % 26);
            } else {
                result = result + c;
            }
        }
        return result;
    }

    // -------- MAIN METHOD --------

    public static void main(String[] args) throws Exception {

        String originalText = "This is my project";

        // ----- ENCRYPTION -----
        String step1 = caesarEncrypt(originalText);
        String step2 = reverseText(step1);
        String encryptedText = asciiEncrypt(step2);

        FileWriter encryptedFile = new FileWriter("encrypted.txt");
        encryptedFile.write(encryptedText);
        encryptedFile.close();

        // ----- DECRYPTION -----
        String dStep1 = asciiDecrypt(encryptedText);
        String dStep2 = reverseText(dStep1);
        String decryptedText = caesarDecrypt(dStep2);

        FileWriter decryptedFile = new FileWriter("decrypted.txt");
        decryptedFile.write(decryptedText);
        decryptedFile.close();

        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
