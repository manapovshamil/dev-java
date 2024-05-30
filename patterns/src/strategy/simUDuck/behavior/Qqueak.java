package strategy.simUDuck.behavior;

public class Qqueak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Умею пищать!");
    }
}
