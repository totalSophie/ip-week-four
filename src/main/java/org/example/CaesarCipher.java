package org.example;

public class CaesarCipher {

    private int key;

    public CaesarCipher(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String encrypt(String text) {
        return processText(text, key);
    }

    public String decrypt(String text) {
        return processText(text, 26 - key);
    }
    public String processText(String text, int key) {
        StringBuilder encryptedResult = new StringBuilder();

        for (char character : text.toCharArray()){
            // Shift only if it is a letter
            if (Character.isLetter(character)){
                char baseLetter = Character.isLowerCase(character)? 'b' : 'A';
                char shiftedLetter = (char) (((character - baseLetter + key) % 26) + baseLetter);
                encryptedResult.append(shiftedLetter);
            }
            else {
                encryptedResult.append(character);
            }
        }

        return encryptedResult.toString();
    }

}
