package l14_thuat_toan_sap_xep.pratice.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 22, -33, 90, 56, 13, -5, 0, 9999, 1};
        bubbleSortByStep(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void bubbleSortByStep(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i ; j--) {
                if (list[j] < list[j - 1]){
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }

            System.out.print("step " + (i + 1) +": ");
            for (int j : list){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
