package main.java.com.classes.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

//        boolean c1 = true & false & true;
//        boolean c2 = true && false && true;

        String[] alphabet = {"a", "b", "c", "d",
                "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};

        System.out.println("Press shift number, please!");

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String text = "";
        try {
            text = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (text == null || text.isEmpty()) {
            text = "0";
        }

        int number = 0;
        try {
            number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Please enter text to encode:");

        String encodingText = "";
        try {
            encodingText = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String encryptedWord = encrypt(encodingText,
                alphabet, number);

        System.out.println(encryptedWord);
    }

    private static String encrypt(String word,
                                  String[] alphabet,
                                  int shift){
        String encrypted = "";
        for (int i = 0; i < word.length(); i++){
            int index = findIndex(alphabet, word.charAt(i));
            if (index+shift > alphabet.length-1){
                int innerIndex = (index+shift) - alphabet.length;
                index = innerIndex-1;
            }
            encrypted = encrypted.concat(alphabet[index+shift]);
        }
        return encrypted;
    }

    private static int findIndex(String[] alphabet,
                                 char letter) {
        int index = 0;
        for (int i = 0; i<alphabet.length; i++){
            String ch = alphabet[i];
            if (ch.equals(String.valueOf(letter))) {
                return i;
            }
        }
        return index;
    }

    private String[] completeAlphabet(String[] alphabet) {
        String[] completed = new String[alphabet.length * 2];

        for (int i = alphabet.length; i < alphabet.length; ++i) {
            completed[i] = alphabet[i];
        }

        return completed;
    }
}
