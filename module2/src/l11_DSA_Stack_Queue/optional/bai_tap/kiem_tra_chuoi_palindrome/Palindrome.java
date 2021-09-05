package l11_DSA_Stack_Queue.optional.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        Stack stack = new Stack();
        Queue queue = new PriorityQueue();
        for (int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
            queue.offer(str.charAt(i));
        }

        String strStack = "";
        String strQueue = "";

        for (int i = 0; i < str.length(); i++){
            strStack += stack.pop();
            strQueue += queue.remove();
        }

        System.out.println(strStack);
        System.out.println(strQueue);

        if (strStack.equals(strQueue)){
            System.out.println(str + " is a palindrome string");
        }else {
            System.out.println(str + " is not a palindrome string");
        }
    }
}
