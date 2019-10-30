package State_Pattern;

public class GumballMachine {
    State hasQuarterState;
    State noQuarterState;
    State soldState;
    State soldOutState;
    State winningState;

    private State state = soldOutState;
    int count = 0;

    GumballMachine(int numOfGumball) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winningState = new WinningState(this);
        this.count = numOfGumball;

        if(this.count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseGumball() {
        System.out.println("糖果發放完畢囉!，請拿取糖果~");
        if(count != 0) {
            count -= 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinningState() {
        return winningState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }
}
