package l11_DSA_Stack_Queue.optional.thuc_hanh.trien_khai_stack_array;

public class MyArrayStackTest {
    public static void main(String[] args) throws Exception{
        MyArrStack myArrStack = new MyArrStack(4);
        myArrStack.push(1);
        myArrStack.push(2);
        myArrStack.push(3);
        myArrStack.push(4);
        System.out.println(myArrStack.size());
        System.out.println(myArrStack.pop());
        System.out.println(myArrStack.size());
    }
}
