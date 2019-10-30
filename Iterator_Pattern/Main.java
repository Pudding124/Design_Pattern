package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 反覆器模式，讓我們可以讀取一個聚集內的每個元素，而不需要將此聚集的實踐方式暴露出來
 * 例子
 * 假設有兩家公司要合併，但其儲存方式不同，現在的任務是一起列出兩家公司的所有員工列表
 * 所以我們透過 Iterator 實作 next, hasNext 方法，根據不同的形態創造出對應的 Iterator
 *
 */
public class Main {
    public static void main(String[] args) {
        CompanyA companyA = new CompanyA();
        CompanyB companyB = new CompanyB();

        ArrayList<Iterator> iteratorList = new ArrayList<>();

        iteratorList.add(companyA.getIterator());
        iteratorList.add(companyB.getIterator());
        printStaffList(iteratorList);
    }

    public static void printStaffList(ArrayList<Iterator> iteratorList) {
        for(Iterator iterator : iteratorList) {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
