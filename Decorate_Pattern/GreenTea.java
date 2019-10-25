package Decorate_Pattern;

public class GreenTea extends Beverage {

    int price = 15;

    GreenTea() {
        description = "Green Tea";
    }

    @Override
    public int cost() {
        return price;
    }
}
