package Singleton_Pattern;

/**
 * 確保一個類別只有一個實體，並給他一個存取的全域點(global point)
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new WorkThread();
        Thread thread2 = new WorkThread();

        thread1.start();
        thread2.start();
    }
}
