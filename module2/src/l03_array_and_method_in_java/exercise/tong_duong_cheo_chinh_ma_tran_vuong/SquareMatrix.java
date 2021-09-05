package l03_array_and_method_in_java.exercise.tong_duong_cheo_chinh_ma_tran_vuong;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do{
            System.out.print("Enter the number of row and column: ");
            n = scanner.nextInt();
        }while (n <= 0);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int choice;
        do{
            System.out.println("Choose diagonal line");
            System.out.println("1. Diagonal starts above");
            System.out.println("2. Diagonal starts bottom");
            System.out.println("3. Sum of two diagonals");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int sum1, sum2, sum3;

            sum1 = 0;
            for (int i = 0; i < n; i++){
                sum1 += arr[i][i];
            }

            sum2 = 0;
            int j = 0;
            for (int i = n-1; i >= 0; i--){
                sum2 += arr[i][j];
                j++;
            }

            sum3 = sum1 + sum2;

            switch (choice){
                case 1:
                    System.out.println("The total of diagonal starts above: " + sum1);
                    break;
                case 2:
                    System.out.println("The total of diagonal starts bottom: " + sum2);
                    break;
                case 3:
                    System.out.println("The total of sum of two diagonals: " + sum3);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 0);
    }
}
