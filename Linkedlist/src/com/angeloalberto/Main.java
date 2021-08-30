package com.angeloalberto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Angelo", 43.43);
        Customer anotherCustomer;
        anotherCustomer = customer;// it relase to his memory
        anotherCustomer.setBalance(12.23); // save the value into the original obj, and pointing to the first class
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i< intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,4);

        for (int i = 0; i< intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
