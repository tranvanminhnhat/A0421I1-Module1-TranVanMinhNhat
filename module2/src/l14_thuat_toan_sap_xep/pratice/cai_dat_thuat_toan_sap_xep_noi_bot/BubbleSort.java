package l14_thuat_toan_sap_xep.pratice.cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 22, -33, 90, 56, 13};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
