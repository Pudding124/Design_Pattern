package Observer_Mode;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

    ArrayList<Observer> observers;

    ConcreteSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    public void notifyObserver(String time) {
        for(Observer o : observers) {
            o.update(time);
        }
    }

    public void setChange(String time) {
        notifyObserver(time);
    }
}
