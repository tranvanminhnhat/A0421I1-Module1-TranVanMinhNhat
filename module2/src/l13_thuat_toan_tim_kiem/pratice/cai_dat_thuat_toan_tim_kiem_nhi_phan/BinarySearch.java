package l13_thuat_toan_tim_kiem.pratice.cai_dat_thuat_toan_tim_kiem_nhi_phan;

public class BinarySearch<T> {
    public static void main(String[] args) {
        int[] arr = {1,2,4,55,66,79,90,123,4456,12345,678865,4445675};
        System.out.println(binarySearch(arr,4));
    }

    public static int binarySearch(int arr[], int element){
        int left = 0;
        int right = arr.length-1;
        int mid;
        while (right >= left){
            mid = (left + right)/2;
            if (element == arr[mid]){
                return mid;
            }
            if (element > arr[mid]){
                left = mid + 1;
            }
            if (element < arr[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }
}
