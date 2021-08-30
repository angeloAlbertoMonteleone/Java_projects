package com.angeloalberto;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNUmber);
    boolean isRinging();
}
