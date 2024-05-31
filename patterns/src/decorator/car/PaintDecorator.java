package decorator.car;

public class PaintDecorator extends CarDecorator{
    public PaintDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.println(" with painted skin");
    }
}
