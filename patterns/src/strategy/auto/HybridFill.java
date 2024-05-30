package strategy.auto;

public class HybridFill implements FillStrategy{
    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}
