package State_Pattern;

public class SoldState implements State {
    GumballMachine gumballMachine;

    SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("發送糖果中~ 請勿再次投幣");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("發送糖果中~ 已無法退幣囉");
    }

    @Override
    public void turnCrank() {
        System.out.println("發送糖果中~ 請勿再次轉動旋鈕");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();
        if(gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("糖果賣完了~ QAQ");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
