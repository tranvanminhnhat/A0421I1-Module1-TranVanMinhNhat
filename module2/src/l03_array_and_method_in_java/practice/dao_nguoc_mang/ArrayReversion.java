package l03_array_and_method_in_java.practice.dao_nguoc_mang;

import java.util.Scanner;

public class ArrayReversion {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter a size of array: ");
            size = scanner.nextInt();
            if(size > 20 || size < 5){
                System.out.println("the maximum length is 20 and the minimum is 5");
            }
        }while (size < 5 || size >20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element " + i +": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " \t");
        }
    }
}
