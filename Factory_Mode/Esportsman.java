package Factory_Mode;

public class Esportsman implements Student {
    private String name;

    Esportsman() {
        name = "我是電競選手";
    }

    @Override
    public String getName() {
        return name;
    }
}
