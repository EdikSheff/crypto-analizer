public class CaesarCipher {
    public String encrypt(String message, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char thisChar = message.charAt(i);
            int encryptedChar = (int) thisChar +key;
            encryptedText.append((char) encryptedChar);
        }
        return encryptedText.toString();
    }

    public String decrypt(String encryptedMessage, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char thisChar = encryptedMessage.charAt(i);
            int decryptedChar = (int) thisChar - key;
            decryptedText.append((char) decryptedChar);
        }
        return decryptedText.toString();
    }
}