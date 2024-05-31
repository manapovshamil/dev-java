package decorator.pizza;

public class Main {
    public static void main(String[] args) {

        Pizza pepperoni = new Pepperoni();
        System.out.println("name: " + pepperoni.getDescription() + ", price: " + pepperoni.getPrice());

        pepperoni = new CheeseDecorator(pepperoni);
        System.out.println("name: " + pepperoni.getDescription() + ", price: " + pepperoni.getPrice());

        pepperoni = new CheeseDecorator(pepperoni);
        pepperoni = new MeatDecorator(pepperoni);
        System.out.println("name: " + pepperoni.getDescription() + ", price: " + pepperoni.getPrice());
    }
}
