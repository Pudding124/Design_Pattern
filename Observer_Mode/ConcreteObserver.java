package Observer_Mode;

public class ConcreteObserver implements Observer {

    String time;
    Subject subject;

    ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(String time) {
        this.time = time;
        show();
    }

    public void show() {
        System.out.println("Time: "+time);
    }
}
