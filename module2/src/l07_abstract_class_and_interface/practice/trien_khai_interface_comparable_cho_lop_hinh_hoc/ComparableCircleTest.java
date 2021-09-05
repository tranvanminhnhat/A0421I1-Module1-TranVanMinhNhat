package l07_abstract_class_and_interface.practice.trien_khai_interface_comparable_cho_lop_hinh_hoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[1].setRadius(6);
        circles[2] = new ComparableCircle(3.5, "white",false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sort:");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
