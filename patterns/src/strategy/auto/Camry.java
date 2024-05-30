package strategy.auto;

public class Camry extends Auto{
    public Camry(){
        super(new BenzinFill());
    }
}
