package com.angeloalberto.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
        private static Scanner scanner = new Scanner(System.in);
        private static ArrayList<Contacts> contactsArray = new ArrayList<Contacts>();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printListsOfContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }



    public static void printListsOfContacts(){
        if(contactsArray.size() > 1) {
            System.out.println("You have " + contactsArray.size() + " contacts");
        }else {
            System.out.println("You have " + contactsArray.size() + " contact");
        }

        for (int i = 0; i < contactsArray.size(); i++){
            System.out.println((i+1) + ". "+ contactsArray.get(i).getName() + " " + contactsArray.get(i).getSurname());
        }
    }

    public static void addNewContact(){
        System.out.println("Enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter the surname of the contact: ");
        String surname = scanner.nextLine();
        Contacts contacts = new Contacts(name, surname);

        contactsArray.add(contacts);
    }

    public static void updateExistingContact(){
        System.out.println("Enter the name: ");
        String nameToUpdate = scanner.nextLine();
        if(searchContact(nameToUpdate) == true) {
           updateExistingContact(nameToUpdate);
        }
    }

    public static void updateExistingContact(String name) {
        System.out.println("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new contact surname: ");
        String newSurname = scanner.nextLine();
        Contacts newContact = new Contacts(newName, newSurname);

        for (int i = 0; i < contactsArray.size(); i++) {
            if (contactsArray.get(i).getName().contains(name)) {
                contactsArray.set(contactsArray.indexOf(contactsArray.get(i).getName().contains(name)), newContact);
                System.out.println("Element has been removed");
            }
        }
    }


    public static void removeContact(){
        // if(searchContact(name) == true){
        System.out.println("Enter the name: ");
        String nameToRemove = scanner.nextLine();
        if(searchContact(nameToRemove) == true) {
            removeContact(nameToRemove);
        }
    }

    public static void removeContact(String name) {
        for (int i = 0; i < contactsArray.size(); i++) {
            if (contactsArray.get(i).getName().contains(name)) {
                contactsArray.remove(contactsArray.get(i));
                System.out.println("Element has been removed");
            } else {
                System.out.println("Element has been not removed");
            }
        }
    }

    public static boolean searchContact(){
        System.out.println("Enter the contact name: ");
        String typedName = scanner.nextLine();
        searchContact(typedName);
        return true;
    }

    public static boolean searchContact(String name){
            for (int i = 0; i < contactsArray.size(); i++) {
                if (contactsArray.get(i).getName().contains(name)) {
                    System.out.println("The name " + contactsArray.get(i).getName() + " has been found");
                    return true;
                } else {
                    System.out.println("Element has been not found");
                    return false;
                }
            }
        return false;
    }



}
