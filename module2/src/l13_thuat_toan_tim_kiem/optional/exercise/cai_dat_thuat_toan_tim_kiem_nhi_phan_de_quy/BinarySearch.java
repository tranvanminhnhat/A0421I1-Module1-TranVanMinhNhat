package l13_thuat_toan_tim_kiem.optional.exercise.cai_dat_thuat_toan_tim_kiem_nhi_phan_de_quy;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,66,345,745,6789,23467,894567,2456845};
        int left = 0;
        int right = arr.length - 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(binarySearchWithRecursive(arr,number, left, right));
    }

    public static int binarySearchWithRecursive(int[] arr, int element, int left, int right){
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == element)
                return mid;
            if (arr[mid] > element)
                return binarySearchWithRecursive(arr, element, left, mid - 1);
            return binarySearchWithRecursive(arr, element, mid + 1, right);
        }

        return -1;
    }
}
