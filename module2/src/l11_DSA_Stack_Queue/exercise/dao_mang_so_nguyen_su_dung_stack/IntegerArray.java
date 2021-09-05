package l11_DSA_Stack_Queue.exercise.dao_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class IntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array before reverse:");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }

        Stack wStack = new Stack();
        for (int i = 0; i < arr.length; i++){
            wStack.push(arr[i]);

        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)wStack.pop();
        }
        System.out.println("Array after reverse: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }
    }
}
