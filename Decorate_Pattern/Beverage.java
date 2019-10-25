package Decorate_Pattern;

public abstract class Beverage {
    String description = "Unknow";

    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
