package Factory_Mode;

public class Sportsman implements Student {
    private String name;

    Sportsman() {
        name = "我是運動員";
    }

    @Override
    public String getName() {
        return name;
    }
}
