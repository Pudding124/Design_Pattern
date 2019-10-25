package Adapter_Mode;

public class TwoPinTW implements TwoPin {
    @Override
    public void getPowerByTwoPin() {
        System.out.println("兩孔插頭充電中~~");
    }
}
