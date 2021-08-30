package com.angeloalberto.challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesArrayList = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branchesArrayList = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branchesArrayList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String name, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(name, amount);
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for (int i = 0; i < this.branchesArrayList.size(); i++){
            Branch checkedBranch = this.branchesArrayList.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomer = branch.getCustomerArrayList();

            for (int i = 0; i < branchCustomer.size(); i++){
                Customer checkedCustomer = branchCustomer.get(i);
                System.out.println("Customer " + checkedCustomer.getName() + " [ " + (i+1) + " ]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = checkedCustomer.getTransactions();

                    for (int j = 0; j< transactions.size(); j++){
                        System.out.println("[ " + (j+1) + " ] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else{
            return false;
        }
    }


}
