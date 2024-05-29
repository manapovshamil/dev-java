package decorator.starbuzz;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
