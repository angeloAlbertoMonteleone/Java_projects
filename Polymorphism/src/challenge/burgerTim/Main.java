package challenge.burgerTim;

import challenge.burger.DeluxeHamburger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.5, "white");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.20);
        hamburger.addHamburgerAddition2("lettuce", 0.40);
        hamburger.addHamburgerAddition3("cheese", 1.0);
        hamburger.addHamburgerAddition4("olives", 0.50);

        System.out.println("total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("veggie", 9.00);
        healthyBurger.addHamburgerAddition1("egg", 1.00);
        healthyBurger.addHealthyAddition1("olives", 1.00);
        System.out.println("total cost for healthy burger is "+ healthyBurger.itemizeHamburger());


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("chips", 32);
        System.out.println(deluxeBurger.itemizeHamburger());
    }
}
