package l03_array_and_method_in_java.exercise.them_phan_tu_vao_mang;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int arr[];
        do {
            System.out.print("Enter the number of array: ");
            n = scanner.nextInt();
        }while (n <= 0);

        arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element " + i +": ");
            arr[i] = scanner.nextInt();
        }

        int index, k;
        System.out.print("Enter the value that you want to add to array: ");
        k = scanner.nextInt();
        do{
            System.out.print("Enter the index of " + k +": ");
            index = scanner.nextInt();
        }while (index < 0 || index > n);

        System.out.println("Array after adding the element");
        int newArr[] = addElementToArray(arr,k,index);
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + "\t");
        }
    }

    public static int[] addElementToArray(int[] arr, int k, int index){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        for (int i = newArr.length-1; i >= index; i--){
            if(index == i){
                newArr[index] = k;
            }else {
                newArr[i] = newArr[i-1];
            }
        }

        return newArr;
    }
}
