package com.angeloalberto;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {
        private static Scanner scanner = new Scanner(System.in);
        private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                    case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current item number: ");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item: ");
        String itemNumber = scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in grocery list");
        }else{
            System.out.println(searchItem + " not found in the shopping list");
        }
    }

    public static void processArrayList(){
        //different methods to copy array inside array
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        // ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        //String[] myArray = new String[groceryList.getGroceryList().size()];
        //myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
