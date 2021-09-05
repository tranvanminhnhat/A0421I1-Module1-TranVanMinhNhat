package l14_thuat_toan_sap_xep.pratice.cai_dat_thuat_toan_sap_xep_chon;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, -3, 124, 100000,1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
