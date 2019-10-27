package Template_Method_Pattern;

public class Tea extends CaffeineBeverage {
    @Override
    void operation1() {
        System.out.println("將熱水加入到茶葉中~");
    }

    @Override
    void operation2() {
        System.out.println("過濾並倒出茶水~");
    }
}
