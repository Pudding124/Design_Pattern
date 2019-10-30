package State_Pattern;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投錢中~");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("還沒有投錢唷~ 沒辦法退幣唷");
    }

    @Override
    public void turnCrank() {
        System.out.println("還沒有投錢唷~ 沒辦法轉動旋鈕唷");
    }

    @Override
    public void dispense() {
        System.out.println("還沒有投錢唷~~ 沒辦法發糖果唷");
    }
}
