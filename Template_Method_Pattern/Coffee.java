package Template_Method_Pattern;

public class Coffee extends CaffeineBeverage {
    @Override
    void operation1() {
        System.out.println("將熱水加入到咖啡粉中~");
    }

    @Override
    void operation2() {
        System.out.println("過濾並倒出咖啡~");
    }

    @Override
    public void optionOperation() {
        System.out.println("加入牛奶~");
    }
}
