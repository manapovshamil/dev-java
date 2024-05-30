package strategy.simUDuck.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Не издаю звука!");
    }
}
