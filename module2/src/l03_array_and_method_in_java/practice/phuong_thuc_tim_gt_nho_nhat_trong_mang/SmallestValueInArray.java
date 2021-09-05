package l03_array_and_method_in_java.practice.phuong_thuc_tim_gt_nho_nhat_trong_mang;

public class SmallestValueInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 99, 0, 19, -1};
        System.out.println("The min value in array is " + arr[minValue(arr)]);

    }
    public static int minValue(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
