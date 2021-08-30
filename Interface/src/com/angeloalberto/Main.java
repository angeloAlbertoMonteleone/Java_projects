package com.angeloalberto;

public class Main {
    public static void main(String[] args) {
        ITelephone angeloMobile; // or ITelephone mobile;
        angeloMobile = new DeskPhone(23424244);
        angeloMobile.powerOn();
        angeloMobile.callPhone(23424244);
        angeloMobile.answer();

        angeloMobile = new MobilePhone(43345353);
        angeloMobile.powerOn();
        angeloMobile.callPhone(43345353);
        angeloMobile.answer();

    }
}
