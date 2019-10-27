package Template_Method_Pattern;

/**
 * 將一個演算法的骨架(流程)定義在一個方法中，
 * 而演算法中本身用到的一些方法，則是定義再次類別中
 * -->
 * 樣板方法讓次類別在不改變演算法的結構下，重新定義演算法的某些步驟
 * 例子
 * Arrays.sort，Object[] object 可藉由重新定義 compareTo 此方法，讓物件可以自動排序大小
 */
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepare();
        tea.prepare();
    }
}
