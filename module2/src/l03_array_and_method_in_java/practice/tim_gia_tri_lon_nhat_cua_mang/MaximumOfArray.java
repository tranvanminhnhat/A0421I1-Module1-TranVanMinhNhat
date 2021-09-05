package l03_array_and_method_in_java.practice.tim_gia_tri_lon_nhat_cua_mang;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, 6, 8, 12, 100};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The max number in the array is " + max);
    }
}
