package l11_DSA_Stack_Queue.optional.bai_tap.doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        int temp = decimalNumber;
        Stack<Integer> stack = new Stack<>();
        int num;
        while (temp != 0){
            num = temp%2;
            stack.push(num);
            temp = temp/2;
        }
        while (stack.size() != 0){
            System.out.print(stack.pop() + "\t");
        }
    }
}
