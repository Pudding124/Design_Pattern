package Iterator_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class CompanyB_Iterator implements Iterator {
    private String description;
    ArrayList<String> staffs;
    int max;
    int index = 0;

    CompanyB_Iterator(ArrayList<String> staffs) {
        description = "B公司的員工清冊";
        this.staffs = staffs;
        max = staffs.size();
    }

    public Object next() {
        String staff = staffs.get(index);
        index += 1;
        return staff;
    }

    public boolean hasNext() {
        if(index > max-1) {
            return false;
        }else {
            return true;
        }
    }

    public String getDescription() {
        return description;
    }
}
