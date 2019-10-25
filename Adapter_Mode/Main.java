package Adapter_Mode;

/**
 * 將一個類別的介面，轉換成另一個介面供客戶使用。
 * 轉接器可讓原本介面的類別合作無間
 * 例子:
 * 假設目前只有一個兩孔插座，但我們的插頭是三孔插頭
 * 所以我們設置了一個轉接器，實作兩孔的介面，並將三孔的相關物件、方法或請求，放入到實作的兩孔介面中
 * 藉此將三孔插頭變成兩孔插頭。
 */
public class Main {
    public static void main(String[] args) {
        TwoPin twoPin = new TwoPinTW();
        ThreePin threePin = new ThreePinNA();

        PowerPlugAdapter powerPlugAdapter = new PowerPlugAdapter(threePin);

        twoPin.getPowerByTwoPin();
        powerPlugAdapter.getPowerByTwoPin();
    }
}
