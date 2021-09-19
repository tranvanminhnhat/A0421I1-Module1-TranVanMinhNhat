package l1111_demo;

import java.util.Comparator;

public class GpaComparatorAscending implements Comparator<GoodStudent> {

    @Override
    public int compare(GoodStudent o1, GoodStudent o2) {
        if (o1.getGpa() < o2.getGpa()){
            return -1;
        }else if (o1.getGpa() > o2.getGpa()){
            return 1;
        }else {
            return 0;
        }
    }
}
