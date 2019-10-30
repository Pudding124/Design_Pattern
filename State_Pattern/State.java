package State_Pattern;

// 定義目標所擁有的所有狀態
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
