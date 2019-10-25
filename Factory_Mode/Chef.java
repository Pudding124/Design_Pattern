package Factory_Mode;

public class Chef implements Student {
    private String name;

    Chef() {
        name = "我是廚師";
    }

    @Override
    public String getName() {
        return name;
    }
}
