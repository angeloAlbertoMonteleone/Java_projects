package com.angeloalberto.timChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("3393950162");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }


    private static void updateContact(){
        System.out.println("Enter existing contact name to update: ");
        String oldName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(oldName);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new updated name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = new Contact(newName, newNumber);

        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating");
        }
    }


    private static void addNewContact(){
        System.out.println("Enter new name contact ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("New contact added " + contact.getName());
        }else{
            System.out.println("Cannot add " + contact.getName());
        }
    }


    private static void removeContact(){
        System.out.println("Enter existing contact name to update: ");
        String oldName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(oldName);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(oldName);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name "+ existingContact.getName() + " phone number is " + existingContact.getPhoneNumber());
    }

    public static void startPhone(){
        System.out.println("Starting phone..");
    }

    public static void printActions(){
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown \n" +
                "1 - to print contacts \n" +
                "2 - to add a new contact \n" +
                "3 - to update an existing contact \n" +
                "4 - to remove an existing contact \n"+
                "5 - query if an existing contact exists \n" +
                "6 - to print a list of available actions. \n");
    }
}
