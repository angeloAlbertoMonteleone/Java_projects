package com.angeloalberto.challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Credit suisse");
        bank.addBranch("Geneve");
        bank.addCustomer("Geneve","Angelo", 3.00);
        bank.addCustomer("Geneve","Alberto", 10.00);
        bank.addCustomer("Geneve","Tim", 100.00);

        bank.addBranch("Lugano");
        bank.addCustomer("Lugano","Giovanni", 545.00);
        bank.addCustomer("Lugano","Giovanni", 1000.00);
        bank.addCustomer("Lugano","Mirco", 1043.00);
        bank.addCustomer("Lugano","Jhon", 112.00);

        bank.listCustomers("Lugano", true);

        bank.addBranch("Basel");

        if(!bank.addCustomer("Basel", "Angelo", 2131)){
            System.out.println("Error Basel doesn't exist");
        }

        if(!bank.addBranch("Bern")){
            System.out.println("Bern branch already exist");
        }

        if(!bank.addCustomerTransaction("Bern", "Fergus", 433)){
            System.out.println("Customer doesn't exist");
        }

        if(!bank.addCustomer("Lugano", "Angelo", 343)){
            System.out.println("Customer Angelo already exist");
        }
    }




}
