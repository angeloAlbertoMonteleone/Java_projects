package com.angeloalberto;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] integersArray = readIntegers(count);
        int returnedMin = findMin(integersArray);
        System.out.println("the min number is " + returnedMin);
    }

    public static int[] readIntegers(int count){
        System.out.println("Write " + count + " numbers: ");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){
        /*
        int min = Arrays.stream(array).min().getAsInt();
        return min;
        */

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            int value = array[i];

            if(value < min){
                min = value;
            }
        }
        return min;
    }


}
