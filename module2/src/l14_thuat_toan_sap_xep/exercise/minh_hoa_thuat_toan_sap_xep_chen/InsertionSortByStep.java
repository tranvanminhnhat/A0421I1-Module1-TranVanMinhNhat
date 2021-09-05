package l14_thuat_toan_sap_xep.exercise.minh_hoa_thuat_toan_sap_xep_chen;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, -3, 124, 100000,1};
        insertionSort(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tem = arr[i];
            int pos = i;
            while (pos > 0 && tem < arr[pos - 1]){
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = tem;
            System.out.print("Step " + i + ":");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}
