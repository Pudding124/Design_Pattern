package Facade_Pattern;

public class HomeController {
    Light light;
    TV tv;

    HomeController(Light light, TV tv) {
        this.light = light;
        this.tv = tv;
    }

    public void allOpen() {
        System.out.println(light.openLight());
        System.out.println(tv.openTV());
    }

    public void allClose() {
        System.out.println(light.closeLight());
        System.out.println(tv.closeTV());
    }
}
