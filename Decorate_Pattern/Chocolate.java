package Decorate_Pattern;

public class Chocolate extends Decorator {
    Beverage beverage;
    int price = 10;

    Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Chocolate";
    }

    @Override
    public int cost() {
        return beverage.cost()+price;
    }
}
