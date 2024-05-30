package strategy.simUDuck;

import strategy.simUDuck.behavior.FlyWithWinks;
import strategy.simUDuck.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWinks();
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
