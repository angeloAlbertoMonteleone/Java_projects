package challenge.burger;

public class HelthyBurger extends BasicBurger{
    private int onion;
    private int cucumber;

    private double carrot;
    private double mustard;
    private double avocado;
    private double veggieSauce;
    private double dryTomatoes;
    private double olives;

    public HelthyBurger() {
        super("HealthyBurger", "Brown rye bread roll", "quinoa meat");
        this.onion = 1;
        this.cucumber = 1;

        this.avocado = 1.0;
        this.carrot = 0.50;
        this.veggieSauce = 0.50;
        this.dryTomatoes = 1;
        this.mustard = 0.50;
        this.olives = 0.20;
    }

    @Override
    public double addIngredient(double ingredient) {
        return super.addIngredient(ingredient);
    }

    public int getOnion() {
        return onion;
    }

    public int getCucumber() {
        return cucumber;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getMustard() {
        return mustard;
    }

    public double getAvocado() {
        return avocado;
    }

    public double getVeggieSauce() {
        return veggieSauce;
    }

    public double getDryTomatoes() {
        return dryTomatoes;
    }

    public double getOlives() {
        return olives;
    }
}
