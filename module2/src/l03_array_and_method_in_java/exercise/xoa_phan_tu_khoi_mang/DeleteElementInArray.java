package l03_array_and_method_in_java.exercise.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of element in array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int arr[] = new int[n];

        System.out.println("Enter the element of array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        int i;
        int c;
        for (c = i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }
        n = c;
        System.out.println("Array after deleting element " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
