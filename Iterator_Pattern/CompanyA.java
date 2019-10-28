package Iterator_Pattern;

import java.util.Iterator;

public class CompanyA {
    private String[] staffList;

    CompanyA() {
        staffList = new String[3];
        staffList[0] = "11";
        staffList[1] = "22";
        staffList[2] = "33";
    }

    public Iterator getIterator() {
        return new CompanyA_Iterator(staffList);
    }
}
