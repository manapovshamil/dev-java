package decorator.pizza;

public class CheeseDecorator extends PizzaDecorator{

    CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 200;
    }
}
