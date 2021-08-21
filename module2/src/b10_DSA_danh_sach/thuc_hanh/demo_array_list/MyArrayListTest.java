package b10_DSA_danh_sach.thuc_hanh.demo_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayLists = new MyArrayList<Integer>();
        myArrayLists.add(1);
        myArrayLists.add(2);
        myArrayLists.add(4);
        myArrayLists.add(5);
        myArrayLists.add(2,3);
        for (int i = 0; i < myArrayLists.size(); i++){
            System.out.println(myArrayLists.get(i));
        }
    }
}
