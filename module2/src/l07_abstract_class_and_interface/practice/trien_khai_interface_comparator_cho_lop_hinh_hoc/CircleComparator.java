package l07_abstract_class_and_interface.practice.trien_khai_interface_comparator_cho_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }else if (c1.getRadius() < c2.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }
}
