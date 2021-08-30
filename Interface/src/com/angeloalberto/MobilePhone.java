package com.angeloalberto;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        }else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNUmber) {
        if(phoneNUmber == myNumber && (isOn)){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        if(isOn){
            return isRinging;
        }
        return false;
    }
}
