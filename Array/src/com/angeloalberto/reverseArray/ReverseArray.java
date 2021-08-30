package com.angeloalberto.reverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println("Array "+ Arrays.toString(intArray));

        reverse(intArray);

        System.out.println("Reversed array "+ Arrays.toString(intArray));
    }

    public static void reverse(int[] array){
        //maxIndex = 4
        int maxIndex = array.length -1;
        //halfLength = 2
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            //when i = 0
            //int temp = array[0]
            int temp = array[i];
            //array[0] = array[4]
            array[i] = array[maxIndex - i];
            //array[4] = array[0]
            array[maxIndex - i] = temp;
        }

        //when i = 1;
        //int temp = array[1]
        //array[1] = array[3]
        //array[3] = temp
    }
}
