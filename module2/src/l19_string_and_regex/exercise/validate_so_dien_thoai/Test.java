package l19_string_and_regex.exercise.validate_so_dien_thoai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        PhoneNumberRegex phoneNumberRegex = new PhoneNumberRegex();
        if (phoneNumberRegex.validate(phoneNumber)){
            System.out.println("Successfully");
        }else {
            System.out.println("error");
        }
    }
}
