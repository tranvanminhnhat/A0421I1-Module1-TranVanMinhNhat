package l01_introduction_to_java.exercise.chuyen_doi_tien_te;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Enter the USD currency: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("The number of money after converting to vnd is "+ vnd+ " VND");
    }
}
