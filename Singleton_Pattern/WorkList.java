package Singleton_Pattern;

// 假設有一份工作清單，大家只能共同持有這一份
public class WorkList {
    // 若不想要使用 lazy instantiaze，可在宣告時，直接建立實體
    private static volatile WorkList workList;

    private int accessPeople = 0;

    // 不能由外部生成實例，只能透過該類別內部自我生成實例
    private WorkList() {}

    // 生成單一實例，並讓外界可以獲取該實例，並用 static ，讓外界不用建立實例物件，即可呼叫該方法(類別方法)
    public static WorkList getWorkList() {
        // lazy instantiaze 的作法，當有需要才會產生
        if(workList == null) {
            // WorkList.class -> 一次只能有一個 Thread 讀取此類別的所有實例
            // this -> 只有一個 Thread 能讀取該實例(可能會有多個實例)
            synchronized (WorkList.class) {
                if (workList == null) {
                    workList = new WorkList();
                }
            }
        }
        return workList;
    }

    public int getAccessNumber() {
        synchronized (WorkList.class) {
            accessPeople++;
        }
        return accessPeople;
    }
}
