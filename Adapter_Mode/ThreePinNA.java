package Adapter_Mode;

public class ThreePinNA implements ThreePin {
    @Override
    public void getPowerByThreePin() {
        System.out.println("三孔插頭充電中~~");
    }
}
