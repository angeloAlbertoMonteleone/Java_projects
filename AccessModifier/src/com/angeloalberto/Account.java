package com.angeloalberto;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited");
        }else{
            System.out.println("cannot deposit negative sums");
        }
    }


    public void withdraw(int amount){
        int withdraw = -amount;
        if(withdraw < 0){
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw. Balance is now " + this.balance);
        }else{
            System.out.println("Cannot withdraw negative sums");
        }
    }


    public void calculateBalance(){
        this.balance = 0;
        for (int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
