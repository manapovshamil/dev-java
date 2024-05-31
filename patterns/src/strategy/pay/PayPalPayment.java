package strategy.pay;

public class PayPalPayment implements PayStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal");
    }
}
