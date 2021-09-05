package l03_array_and_method_in_java.exercise.so_lan_xuat_hien_cua_ky_tu_trong_chuoi;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == character){
                count++;
            }
        }

        System.out.println("\nThe number of character " + character + " is " + count);
    }
}
