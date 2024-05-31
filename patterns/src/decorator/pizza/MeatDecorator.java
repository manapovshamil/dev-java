package decorator.pizza;

public class MeatDecorator extends PizzaDecorator {

    MeatDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Meat";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 400;
    }
}
