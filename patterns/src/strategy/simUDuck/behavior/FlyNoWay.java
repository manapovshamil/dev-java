package strategy.simUDuck.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Не умею летать!");
    }
}
