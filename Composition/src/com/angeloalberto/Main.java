package com.angeloalberto;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("23232", "HP", "240", dimensions);

        Monitor theMonitor = new Monitor("4334", "Dell", 17, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("43554", "Acer", 4,6, "vs.44");

        PC thePC = new PC(theCase, theMonitor,theMotherboard);
        thePC.powerUp();

        /*thePC.getMonitor().drawPixelAt(1500,1200,"blue");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();*/
    }
}
