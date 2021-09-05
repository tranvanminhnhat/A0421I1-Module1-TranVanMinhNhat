package l03_array_and_method_in_java.optional;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create array
        int n;
        do{
            System.out.print("Enter then width of array: ");
            n = scanner.nextInt();
        }while (n <= 0);

        int[] arr = new int[n];
        System.out.println("Add element to array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element of index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        //Total of array
        System.out.println("Total of array: " + calculateTheOddSumOfArr(arr));

        //Search value in array
        System.out.print("Enter a value that you want to check that it exist in array or not: ");
        int k = scanner.nextInt();
        if(searchElementInArr(arr,k) == -1){
            System.out.println("Element " + k + " is not in array");
        }else {
            System.out.println("Element " + k + " is in index " + searchElementInArr(arr,k) + " of array");
        }

        //sort array
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++){
            System.out.print(sortASC(arr)[i] + "\t");
        }
        System.out.println();

        //Add Element to array
        System.out.print("Enter a value that you want to add to arr: ");
        int h = scanner.nextInt();
        System.out.println("Array after inserting and sorting");
        for (int i = 0; i < arr.length + 1; i++){
            System.out.print(insertElementToSortAscendingArr(arr, h)[i] + "\t");
        }
    }

    public static int calculateTheOddSumOfArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int searchElementInArr(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static int[] sortASC(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertElementToSortAscendingArr(int[] arr, int h){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = h;
        return sortASC(newArr);
    }
}
