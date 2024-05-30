package strategy.simUDuck.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Умею кракать!");
    }
}
