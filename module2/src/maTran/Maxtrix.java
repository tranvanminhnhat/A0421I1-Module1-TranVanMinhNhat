package maTran;

import java.util.Scanner;

public class Maxtrix {
    public static void main(String[] args) {
        int row1, col1;
        int row2, col2;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập số hàng của ma trận a: ");
            row1 = scanner.nextInt();
            System.out.print("Nhập số cột của ma trận a: ");
            col1 = scanner.nextInt();
            System.out.print("Nhâp số hàng của ma trận b: ");
            row2 = scanner.nextInt();
            System.out.print("Nhập số cột của ma trận b: ");
            col2 = scanner.nextInt();
        }while (col1 != row1);

        int[][] A = new int[row1][col1];
        int[][] B = new int[row2][col2];
        int[][] C = new int[row1][col2];

        System.out.println("Nhập ma trận a");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++){
                System.out.print("A["+i+"]["+j+"] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Hiển thị ma trận a");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Nhập ma trận b");
        for (int i = 0; i < row2; i++){
            for (int j = 0; j < col2; j++){
                System.out.print("B["+i+"]["+j+"] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("hiển thị ma trận b");
        for (int i = 0; i < row2; i++){
            for (int j = 0; j < col2; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col2; j++){
                for (int k = 0; k < col1; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Hiển thị ma trận C: ");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col2; j++){
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
