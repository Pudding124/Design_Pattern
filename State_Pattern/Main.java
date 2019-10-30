package State_Pattern;

/**
 * 允許物件隨著內在的狀態改變而改變行為，好像物件類別改變了一樣
 * 針對欲設計之目標，定義其可能擁有之狀態與動作，再根據每個不同的狀態設計各種對應的方法(動作)
 * 例子
 * 糖果機，可分為五種狀態(類別)，四種動作(方法)
 * 可根據不同狀態撰寫不同動作與更換狀態
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        gumballMachine.ejectQuarter();
        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("----------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}
