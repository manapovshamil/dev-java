package decorator.car;

public class RealCar implements Car{
    @Override
    public void assemble() {
        System.out.println("RealCar assemble");
    }
}
