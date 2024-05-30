package strategy.auto;

public class Auto {
    private FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill(){
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Gas");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public FillStrategy getFillStrategy() {
        return fillStrategy;
    }
}
