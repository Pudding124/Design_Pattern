package Decorate_Pattern;

/**
 * 動態地將責任加諸在物件上。
 * 若要擴充功能，裝飾者提供比繼承更有彈性的選擇
 * 物件包裝 (物件包物件，將資訊層層包裹，最後一一解析)
 */
public class Main {
    public static void main(String[] args) {
        Beverage greenTea = new GreenTea();
        greenTea = new TapiocaBall(greenTea);
        greenTea = new Cream(greenTea);
        System.out.println("D: "+greenTea.getDescription()+" P: "+greenTea.cost());

        Beverage redTea = new RedTea();
        redTea = new TapiocaBall(redTea);
        redTea = new Chocolate(redTea);
        System.out.println("D: "+redTea.getDescription()+" P: "+redTea.cost());

    }
}
