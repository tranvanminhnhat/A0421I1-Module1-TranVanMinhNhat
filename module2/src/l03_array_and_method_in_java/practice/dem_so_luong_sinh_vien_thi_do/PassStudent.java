package l03_array_and_method_in_java.practice.dem_so_luong_sinh_vien_thi_do;

import java.util.Scanner;

public class PassStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30);

        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }

        System.out.print("\n The number of students passing the exam is " + count);
    }
}
