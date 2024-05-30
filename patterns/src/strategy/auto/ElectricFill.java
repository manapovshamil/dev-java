package strategy.auto;

public class ElectricFill implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Заправляем электричеством!");
    }
}
