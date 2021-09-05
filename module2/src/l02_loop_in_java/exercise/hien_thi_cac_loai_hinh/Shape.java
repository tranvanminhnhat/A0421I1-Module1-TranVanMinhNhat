package l02_loop_in_java.exercise.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Draw the shape");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw the triangle with the bottom-left square edge");
            System.out.println("3. Draw the triangle with the top-left square edge");
            System.out.println("0. Exit program");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the width of square");
                    int width = scanner.nextInt();
                    for (int i = 0;i < width;i++){
                        for (int j = 0; j < width; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the height of triangle with the bottom-left square edge");
                    int height = scanner.nextInt();
                    for (int i = 0; i < height; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter the height of triangle with the top-left square edge");
                    int hei = scanner.nextInt();
                    for (int i = hei; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
