package com.angeloalberto;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Angelo");

    //    ArrayList<int> intArrayList = new ArrayList<int>();
          ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
          intArrayList.add(new IntClass(54));

          Integer integer = new Integer(45);
          Double doubleValue = new Double(12.32);

          ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
          for (int i = 0; i <= 10; i++){
              integerArrayList.add(Integer.valueOf(i));
          }
          for (int i = 0; i <= 10; i++){
              System.out.println(i + "--> " + integerArrayList.get(i).intValue());
          }

          Integer myIntValue = 56; // Integer.valueOf(56)
          int myInt = myIntValue.intValue(); // myIntValue.intValue();

         ArrayList<Double> myDoubleValues = new ArrayList<Double>();
         for (double dbl = 0.0; dbl <= 10.0; dbl+= 0.5){
             myDoubleValues.add(Double.valueOf(dbl));
         }

         for(int i = 0; i < myDoubleValues.size(); i++){
             double value = myDoubleValues.get(i); //myDoubleValue.get(i).doubleValue();
             System.out.println(i + " --> " + value);
         }

    }
}
