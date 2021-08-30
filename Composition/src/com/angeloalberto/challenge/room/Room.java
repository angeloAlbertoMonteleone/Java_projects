package com.angeloalberto.challenge.room;

public class Room {
    private TheWindows theWindows;
    private Doors doors;
    private Bed bed;
    private Desk desk;
    private Computer computer;
    private Chair chair;
    private Table table;

    public Room(TheWindows theWindows, Doors doors, Bed bed, Desk desk, Computer computer, Chair chair, Table table) {
        this.theWindows = theWindows;
        this.doors = doors;
        this.bed = bed;
        this.desk = desk;
        this.computer = computer;
        this.chair = chair;
        this.table = table;
    }

    public void makeBed(){
        System.out.println("Bedroom => Making");
        bed.make();
    }

    public TheWindows getTheWindows() {
        return theWindows;
    }

    public Doors getDoors() {
        return doors;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Computer getComputer() {
        return computer;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
