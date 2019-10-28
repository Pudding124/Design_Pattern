package Iterator_Pattern;

import java.util.Iterator;

public class CompanyA_Iterator implements Iterator {
    private String description;
    String[] staffs;
    int index = 0;

    CompanyA_Iterator(String[] staffs) {
        description = "A公司的員工清冊";
        this.staffs = staffs;
    }

    public Object next() {
        String staff = staffs[index];
        index += 1;
        return staff;
    }

    public boolean hasNext() {
        if(index > staffs.length-1 || staffs[index] == null) {
            return false;
        }else {
            return true;
        }
    }

    public String getDescription() {
        return description;
    }
}
