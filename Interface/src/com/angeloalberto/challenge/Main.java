package com.angeloalberto.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsSaveable player1 = new Player("Angelo", 200, 100);
//        player1.toString();
        saveObject(player1);

//        player1.setHitPoints(90);

        System.out.println(player1);

//        player1.setWeapon("Stormbringer");
//        saveObject(player1);
//        loadObject(player1);
//        System.out.println(player1);

        IsSaveable monster = new Monster("Werewolf", 100, 100);
        System.out.println("Strength " + ((Monster) monster).getStrength());
        saveObject(monster);
        System.out.println(monster);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void loadObject(IsSaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




    public static void saveObject(IsSaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
}
