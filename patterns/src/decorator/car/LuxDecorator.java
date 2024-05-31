package decorator.car;

public class LuxDecorator extends CarDecorator{
    public LuxDecorator(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        System.out.println(" with Luxury interior");
    }
}
