package decorator.starbuzz;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.SMALL){
            cost += .10;
        }else if (beverage.getSize() == Size.MEDIUM){
            cost += .20;
        }else if (beverage.getSize() == Size.LARGE){
            cost += .30;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
