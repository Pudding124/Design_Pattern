package Decorate_Pattern;

public class RedTea extends Beverage {
    int price = 20;

    RedTea() {
        description = "Red Tea";
    }

    @Override
    public int cost() {
        return price;
    }
}
