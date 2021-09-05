package l02_loop_in_java.practice.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to check the prime number: ");
        int number = scanner.nextInt();
        boolean check = true;
        for (int i=2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime umber");
        }
    }
}
