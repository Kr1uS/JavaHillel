package main.java.com.classes.hillel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the size of an array:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] nums = new int[size];

        setValues(nums);
        getValues(nums, "Before sort: ");
        int[] numsSorted = sort(nums);
        getValues(numsSorted, "After sort: ");


    }

    private static void setValues(int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            array[i] = input.nextInt();
        }
    }

    private static void getValues(int[] array, String message){
        System.out.print(message);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    private static int[] sort(int[] array){
        for (int k = 0; k < array.length; k++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int a = array[i - 1];
                    int b = array[i];
                    array[i] = a;
                    array[i - 1] = b;
                }
            }
        }
        return array;
    }


}
