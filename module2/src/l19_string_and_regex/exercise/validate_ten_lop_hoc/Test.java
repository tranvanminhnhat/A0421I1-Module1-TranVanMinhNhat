package l19_string_and_regex.exercise.validate_ten_lop_hoc;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        ClassNameRegex classNameRegex = new ClassNameRegex();
        if (classNameRegex.validate(className)){
            System.out.println("Successfully");
        }else {
            System.out.println("error");
        }
    }
}
