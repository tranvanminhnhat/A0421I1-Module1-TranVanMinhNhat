package l1111_demo;

import java.util.Comparator;

public class NormalStudentFullNameComparatorDescending implements Comparator<NormalStudent> {

    @Override
    public int compare(NormalStudent o1, NormalStudent o2) {

        if (o1.getFullName().charAt(0) > o2.getFullName().charAt(0)){
            return -1;
        }else if (o1.getFullName().charAt(0) < o2.getFullName().charAt(0)){
            return 1;
        }else {
            return 0;
        }
    }
}
