package l03_array_and_method_in_java.practice.chuyen_doi_nhiet_do;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Switch direction selection");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double fahrenheitToCelsius(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
