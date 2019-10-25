package Singleton_Pattern;

public class WorkThread extends Thread {
    public void run() {
        WorkList list = WorkList.getWorkList();
        System.out.println("thread"+WorkThread.currentThread()+": "+list.getAccessNumber());
        System.out.println("物件: "+list.toString());
    }
}
