package Decorate_Pattern;

public class TapiocaBall extends Decorator {
    Beverage beverage;
    int price = 15;

    TapiocaBall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", TapiocaBall";
    }

    @Override
    public int cost() {
        return beverage.cost()+price;
    }
}
