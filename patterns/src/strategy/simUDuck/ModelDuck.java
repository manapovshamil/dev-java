package strategy.simUDuck;

import strategy.simUDuck.behavior.FlyNoWay;
import strategy.simUDuck.behavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
