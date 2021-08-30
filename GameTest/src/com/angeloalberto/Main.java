package com.angeloalberto;

public class Main {
    public static void main(String[] args) {
        String privateVar = "this is a private to main";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scope instance private var is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);
    }
}
