package State_Pattern;

public class WinningState implements State {
    GumballMachine gumballMachine;

    WinningState(GumballMachine gumballMachine) {
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
        System.out.println("中獎了~~ 多給你一顆糖果");
        gumballMachine.releaseGumball();

        if(gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
