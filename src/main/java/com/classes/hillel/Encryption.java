package main.java.com.classes.hillel;

import java.util.Locale;
import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {

        String [] alphabetEN = { " ", "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        String [] alphabetRU = { " ", "а", "б", "в", "г", "д", "е", "ё",
                "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п",
                "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш" , "щ", "ъ",
                "ы", "ь", "э", "ю", "я"};

        System.out.println("-----ENCRYPTION-----");
        System.out.print("Select language (ru/en): ");
        Scanner input1 = new Scanner(System.in);
        String lang = input1.nextLine().toLowerCase();

        System.out.print("Enter word: ");
        Scanner input2 = new Scanner(System.in);
        String word = input2.nextLine();

        if (lang.equals("ru")){
            String encryptedWord = encrypt(word, alphabetRU, 2);
            System.out.print("Encrypted: " + encryptedWord + "\n");
            System.out.println("--------------------");
        }else if (lang.equals("en")){
            String encryptedWord = encrypt(word, alphabetEN, 2);
            System.out.print("Encrypted: " + encryptedWord + "\n");
            System.out.println("--------------------");
        }else{
            System.out.println("Error");
        }

    }

    public static String encrypt(String word, String[] array, int n){       //method encryption
        String encryptedWord = "";

        for (int i = 0; i < word.length(); i++){
            int index = findIndex(array, word.charAt(i));
            if (index+n > array.length-1){
                int innerIndex = (index+n) - array.length;
                index = innerIndex - 1;
            }else if(word.charAt(i) == ' '){
                index += 0;
            }else{
                index += n;
            }
            encryptedWord += array[index];
        }

        return encryptedWord;
    }

    public static int findIndex(String[] array, char letter){       //method find index in array
        int index = -1;
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(String.valueOf(letter))){
                index = i;
            }
        }
        return index;
    }

}
