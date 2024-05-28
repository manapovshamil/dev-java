package strategy.SimUDuck;

import strategy.SimUDuck.behavior.FlyWithWinks;
import strategy.SimUDuck.behavior.Quack;

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
