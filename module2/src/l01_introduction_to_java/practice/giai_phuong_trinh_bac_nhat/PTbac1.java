package l01_introduction_to_java.practice.giai_phuong_trinh_bac_nhat;

import java.util.Scanner;

public class PTbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if(a == 0){
            if(b != 0){
                System.out.println("The equation has no solution");
            }else {
                System.out.println("The equation has many solutions");
            }
        }else {
            System.out.printf("Equation pass with x = %f\n", ((-b)/a));
        }
    }
}
