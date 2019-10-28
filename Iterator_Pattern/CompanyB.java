package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class CompanyB {
    private ArrayList<String> staffList;

    CompanyB() {
        staffList = new ArrayList<>();
        staffList.add("1");
        staffList.add("2");
        staffList.add("3");
        staffList.add("4");
        staffList.add("5");
    }

    public Iterator getIterator() {
        return new CompanyB_Iterator(staffList);
    }
}
