package com.angeloalberto;

public class Main {
    public static void main(String[] args) {
        Account angeloAccount = new Account("Angelo");
        angeloAccount.deposit(1000);
        angeloAccount.withdraw(500);
        angeloAccount.withdraw(-200);
        angeloAccount.deposit(-20);
        angeloAccount.calculateBalance();

        System.out.println("Balance on account is " + angeloAccount.getBalance());
    }
}
