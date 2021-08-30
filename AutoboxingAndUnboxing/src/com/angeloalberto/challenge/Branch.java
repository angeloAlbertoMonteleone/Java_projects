package com.angeloalberto.challenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    private double initialTransactionAmount;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public boolean newCustomer(String name, double initialAmount){
        if(findCustomer(name) == null){
            this.customerArrayList.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < customerArrayList.size(); i++){
            Customer checkedCustomer = this.customerArrayList.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
