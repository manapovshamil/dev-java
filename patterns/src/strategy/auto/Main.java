package strategy.auto;

public class Main {
    public static void main(String[] args) {


        Auto camry = new Camry();
        Auto zeekr = new Zeekr();

        camry.fill();
        zeekr.fill();

        camry.setFillStrategy(new HybridFill());
        camry.fill();
    }
}
