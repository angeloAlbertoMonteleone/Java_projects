package com.angeloalbertomonteleone.exercises;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("548385", 2.50, "Default Name", "Default address", "Default phone");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number; //setNumber(number)
        this.balance = balance; //setBalance(balance)....
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("49393349", 32.3, customerName, email, phoneNumber);
    }

    public void depositingFunds(double deposit){
        this.balance+= deposit;
        System.out.println("Deposit of "+ deposit + " made. New balance is " + this.balance);
    }

    public void withdrawingFunds(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Insufficient funds. Only "+ this.balance + " available.");
        }else{
            this.balance-= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.");
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
