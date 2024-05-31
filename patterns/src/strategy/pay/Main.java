package strategy.pay;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPayStrategy(new CreditCardPayment("1234 4313 3213 4356", "John Doe"));
        cart.pay(100);

        cart.setPayStrategy(new PayPalPayment("test@gmail.com"));
        cart.pay(200);
    }
}
