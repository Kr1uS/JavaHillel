package main.java.com.classes.hillel;

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

    }

}
