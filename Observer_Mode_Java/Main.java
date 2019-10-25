package Observer_Mode_Java;

public class Main {
    public static void main(String[] args) {
        JavaSubject javaSubject = new JavaSubject();
        JavaObserver javaObserver = new JavaObserver(javaSubject);

        javaSubject.setDate("10/16");
    }
}
