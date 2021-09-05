package l07_abstract_class_and_interface.practice.trien_khai_interface_comparator_cho_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "Blue", false);

        System.out.println("Pre-sorted:");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        Comparator comparator = new CircleComparator();
        Arrays.sort(circles,comparator);

        System.out.println("After-sorted:");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
