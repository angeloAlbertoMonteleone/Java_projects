package com.angeloalberto;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChallengeMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(3);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers");
        int[] integers = new int[number];

        for (int i = 0; i < integers.length; i++){
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        // create a copy of the array
       /* int[] arraysorted = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arraysorted[i] = array[i];
        }*/
        int [] arraysorted = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        //create a while loop
        while (flag){
            //if we don t receive a true back from the for loop, we set the variable to false
            flag = false;
            //element 0     50 160
            //element 1     160 50
            //element 2     40 40
            for (int i = 0; i < arraysorted.length -1; i++){
                if(arraysorted[i] < arraysorted[i+1]){
                    temp = arraysorted[i];
                    arraysorted[i] = arraysorted[i+1];
                    arraysorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return arraysorted;
    }


     /*   public static void sortIntegers(int[] array){
            Arrays.sort(array);
        }*/

}
