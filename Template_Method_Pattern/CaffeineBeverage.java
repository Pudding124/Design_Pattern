package Template_Method_Pattern;

public abstract class CaffeineBeverage {
    // 固定演算法流程(框架)
    final void prepare() {
        sameOperation1();
        operation1();
        operation2();
        optionOperation();
    }

    abstract void operation1();

    abstract void operation2();

    // 若有相同之步驟或方法，可以先實作，避免重複程式碼
    private void sameOperation1() {
        System.out.println("煮水~~");
    }

    // 掛勾(hook) --> 預設不做事的實作方法，視情況決定是否複寫(override)
    public void optionOperation() {}

}
