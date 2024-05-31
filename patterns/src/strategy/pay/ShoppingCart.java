package strategy.pay;

public class ShoppingCart {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int amount) {
        payStrategy.pay(amount);
    }
}
