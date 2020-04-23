package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {



    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {    //  PSVM

        int[] myArray = new int[8];
        System.out.println("Please enter " + myArray.length + " elements");
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next Element");
            myArray[j] = scanner.nextInt();

        }


        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


    }   //  EMD of PSVM

    private static int[] copy(int[] array) {
        int[] myNewArray = Arrays.copyOf(array, array.length);
        return myNewArray;
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }   return array;
    }








}
