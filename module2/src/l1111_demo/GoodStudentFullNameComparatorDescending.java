package l1111_demo;

import java.util.Comparator;

public class GoodStudentFullNameComparatorDescending implements Comparator<GoodStudent>{
    @Override
    public int compare(GoodStudent o1, GoodStudent o2) {
        if (o1.getFullName().charAt(0) > o2.getFullName().charAt(0)){
            return -1;
        }else if (o1.getFullName().charAt(0) < o2.getFullName().charAt(0)){
            return 1;
        }else {
            return 0;
        }
    }
}
