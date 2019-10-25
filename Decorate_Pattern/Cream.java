package Decorate_Pattern;

public class Cream extends Decorator {
    Beverage beverage;
    int price = 5;

    Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Cream";
    }

    @Override
    public int cost() {
        return beverage.cost()+price;
    }
}
