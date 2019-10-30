package State_Pattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("無法投幣唷~ 沒有糖果賣了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("無法退錢唷~ 沒有糖果賣了");
    }

    @Override
    public void turnCrank() {
        System.out.println("無法轉動唷~ 沒有糖果賣了");
    }

    @Override
    public void dispense() {
        System.out.println("無法發放唷~ 沒有糖果賣了");
    }
}
