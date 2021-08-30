package com.angeloalberto;

interface Accessible {
    int SOME_CONSTANT = 100; // all are public static final var in interface
    public void methodA();
    void methodB();// automaically public in a interface
    boolean methodC();// automaically public in a interface
}
