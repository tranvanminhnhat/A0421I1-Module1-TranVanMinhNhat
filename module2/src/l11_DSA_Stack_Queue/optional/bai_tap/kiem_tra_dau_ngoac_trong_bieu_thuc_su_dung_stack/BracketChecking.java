package l11_DSA_Stack_Queue.optional.bai_tap.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println(check(str));

    }

    public static boolean check(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }else if (str.charAt(i)=='('){
                stack.push('(');
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
