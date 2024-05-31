package decorator.car;

public class Main {
    public static void main(String[] args) {

        Car realCar = new RealCar();
        realCar = new LuxDecorator(realCar);
        realCar = new PaintDecorator(realCar);
        realCar.assemble();
    }
}
