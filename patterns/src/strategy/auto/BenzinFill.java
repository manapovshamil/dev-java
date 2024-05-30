package strategy.auto;

public class BenzinFill implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Заправляем бензином");
    }
}
