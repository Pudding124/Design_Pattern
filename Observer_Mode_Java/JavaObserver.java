package Observer_Mode_Java;

import java.util.Observable;
import java.util.Observer;

public class JavaObserver implements Observer {
    Observable observable;
    private String date;

    public JavaObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof JavaSubject) {
            JavaSubject obs = (JavaSubject)o;
            System.out.println("Date: "+obs.getDate());
        }
    }
}
