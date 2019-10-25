package Facade_Pattern;

/**
 * 提供統一介面，用來存取系統中的一群介面
 * 定義一個較高層次的介面，讓次系統更容易使用
 * 例子
 * 假設今天燈光與電視的開關相距很遠，但當你看電視必須要開燈，關掉電視必須關燈(省電)
 * 希望可以一個開關可以一次解決多項需求(簡便)
 * 透過 HomeController 將多個物件包裝起來，進而易於使用
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();

        HomeController homeController = new HomeController(light, tv);

        homeController.allOpen();
        homeController.allClose();
    }
}
