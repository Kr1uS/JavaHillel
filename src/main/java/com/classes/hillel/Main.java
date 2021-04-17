package main.java.com.classes.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
