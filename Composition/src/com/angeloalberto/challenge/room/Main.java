package com.angeloalberto.challenge.room;

public class Main {
    public static void main(String[] args) {

        Doors doors = new Doors("wood", 140, 60);
        TheWindows theWindows = new TheWindows("Glass", 50, 50);
        Computer computer = new Computer("4334353", "Lenovo", 17);
        Bed bed = new Bed("soft goose", 140, 60, 200);
        Desk desk = new Desk("wood",5 ,10, "rectangular");
        Chair chair = new Chair("wood", 5,5, "round",3);
        Table table = new Table( chair, "wood", 20,20 , "square");

        Room bedroom = new Room(theWindows, doors, bed, desk, computer, chair, table);
        bedroom.getDoors().openingDoor();
        bedroom.getTheWindows().openingWindows();
        bedroom.makeBed();
        bedroom.getComputer().startingUp();
    }
}
