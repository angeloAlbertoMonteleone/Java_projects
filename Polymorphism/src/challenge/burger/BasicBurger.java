package challenge.burger;

public class BasicBurger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private double lettuce;
    private double tomato;
    private double carrot;
    private double bacon;

    public BasicBurger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 8.00;

        this.lettuce = 0.50;
        this.tomato = 0.50;
        this.carrot = 0.30;
        this.bacon = 1;
    }

    public double addIngredient(double ingredient){
        this.price = getPrice() + ingredient;
        System.out.println(ingredient + " added to burger cost. Current cost is: " + this.price);
        return this.price;
    }

    public double totalPrice(){
        return this.price;
    }


    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getBacon() {
        return bacon;
    }
}
