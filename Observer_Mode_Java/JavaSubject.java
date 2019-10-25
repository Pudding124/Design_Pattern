package Observer_Mode_Java;

import java.util.Observable;

public class JavaSubject extends Observable {

    private String date;

    public JavaSubject() {}

    public void notifyChange() {
        setChanged();
        notifyObservers();
    }

    public void setDate(String date) {
        this.date = date;
        notifyChange();
    }

    public String getDate() {
        return date;
    }
}
