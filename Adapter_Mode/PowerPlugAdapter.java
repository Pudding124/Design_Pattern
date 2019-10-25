package Adapter_Mode;

public class PowerPlugAdapter implements TwoPin {
    ThreePin threePin;

    PowerPlugAdapter(ThreePin threePin) {
        this.threePin = threePin;
    }

    @Override
    public void getPowerByTwoPin() {
        threePin.getPowerByThreePin();
    }
}
