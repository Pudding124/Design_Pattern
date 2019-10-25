package Observer_Mode;

/**
 * 在物件中定義一對多的關係，當一物件受到改變時，其關係物件皆會收到通知，並自動更新
 * 定義：
 * 主題 --> Subject
 * 觀察者 --> Observer
 * 觀察者必須實作一個共通方法，如 update，藉此讓主題可以在更新時呼叫該方法。
 * 當新觀察者加入時，需繼承 Observer 進行實作，並透過 registerObserver 加入到主題名單中
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);

        concreteSubject.setChange("13:00");
        concreteSubject.setChange("14:00");
        concreteSubject.setChange("15:00");

    }
}
