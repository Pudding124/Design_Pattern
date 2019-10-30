package State_Pattern;


import java.util.Random;

public class HasQuarterState implements State {
    Random random = new Random();
    GumballMachine gumballMachine;

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已經有投錢囉~");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退幣中~");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("轉動旋鈕~");
        int num = random.nextInt(10);
        if((num == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinningState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("必須先轉動旋鈕唷~");
    }
}
