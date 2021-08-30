package challenge.burger;

public class DeluxeHamburger extends BasicBurger{
    private double chips;
    private double drinks;

    public DeluxeHamburger() {
        super("Deluxe", "bread deluxe roll", "double burger");

        this.chips = 3.0;
        this.drinks = 2.0;
    }

    @Override
    public double addIngredient(double ingredient) {
        return super.addIngredient(ingredient);
    }

    public double getChips() {
        return chips;
    }

    public double getDrinks() {
        return drinks;
    }
}
