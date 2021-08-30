package challenge.burger;

public class Main {

    public static void main(String[] args) {
        BasicBurger burger = new BasicBurger("Basic burger", "normal bread", "beef");
        System.out.println(burger.getPrice());
        burger.addIngredient(burger.getCarrot());
        burger.addIngredient(burger.getBacon());
        burger.addIngredient(burger.getTomato());
        burger.addIngredient(burger.getLettuce());
        System.out.println("basic burger cost = " +burger.totalPrice());



        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.addIngredient(deluxeHamburger.getChips());
        deluxeHamburger.addIngredient(deluxeHamburger.getDrinks());
        System.out.println("deluxe burger cost = " + deluxeHamburger.totalPrice());


        HelthyBurger helthyBurger = new HelthyBurger();
        helthyBurger.addIngredient(helthyBurger.getAvocado());
        helthyBurger.addIngredient(helthyBurger.getCarrot());
        helthyBurger.addIngredient(helthyBurger.getCucumber());
        helthyBurger.addIngredient(helthyBurger.getDryTomatoes());
        helthyBurger.addIngredient(helthyBurger.getMustard());
        helthyBurger.addIngredient(helthyBurger.getOlives());
        helthyBurger.addIngredient(helthyBurger.getVeggieSauce());
        helthyBurger.addIngredient(helthyBurger.getOnion());
        System.out.println("healthy burger cost = " + helthyBurger.totalPrice());



    }
}
