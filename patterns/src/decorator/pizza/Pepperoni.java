package decorator.pizza;

public class Pepperoni extends Pizza {

    Pizza pizza;

    @Override
    public String getDescription() {
        return "Pepperoni";
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
