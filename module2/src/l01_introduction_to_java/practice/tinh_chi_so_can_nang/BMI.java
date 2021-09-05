package l01_introduction_to_java.practice.tinh_chi_so_can_nang;

import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.println("Your height (m): ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);

        System.out.printf("%s-20.2f%s", "bmi", "Interpretation\n");
        if(bmi<18){
            System.out.printf("%s-20.2f%s", bmi, "Underweight");
        }else if(bmi <25.0){
            System.out.printf("%s-20.2f%s", bmi, "Normal");
        }else if(bmi < 30.0){
            System.out.printf("%s-20.2f%s", bmi, "Overweight");
        }else {
            System.out.printf("%s-20.2f%s", bmi, "Obese");
        }
    }
}
