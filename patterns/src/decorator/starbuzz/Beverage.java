package decorator.starbuzz;

public abstract class Beverage {
    public enum Size {SMALL, MEDIUM, LARGE}

    Size size = Size.SMALL;

    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }
}
