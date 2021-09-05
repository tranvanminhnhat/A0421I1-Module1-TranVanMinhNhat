package l02_loop_in_java.exercise.so_nguyen_to_dau_tien;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime number that you want to print to screen");
        int n = scanner.nextInt();
        int count = 0, i = 2;
        String primeNumberString = "";
        while (count < n){
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
                primeNumberString += i + " ";
            }
            i++;
        }
        System.out.println(primeNumberString);
    }
}
