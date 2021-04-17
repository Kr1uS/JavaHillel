package main.java.com.classes.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[3];
        int[] arrayInt = {1, 2, 3};

        array[0] = "Hi";
        array[1] = "dear";
        array[2] = "friend";

        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1){
                System.out.print(arrayInt[i] + "\n");
            }else{
                System.out.print(arrayInt[i] + ", ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.print(array[i] + "\n");
            }else{
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("Enter text:");
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split(" ");

        String[] symbols = {".", ",", ":", ";", "-", "!", "?", "'"};

        int counter = 0;
        int flag = 1;

        for (int i = 0; i < text.length; i++){
            for (int k = 0; k < symbols.length-1; k++){
                if (text[i].equals(symbols[k])){
                    flag *= 0;
                }else{
                    continue;
                }
            }
            if (flag!=0){
                counter++;
            }
        }

        System.out.println("Number of words in your text: " + counter);

    }

}
