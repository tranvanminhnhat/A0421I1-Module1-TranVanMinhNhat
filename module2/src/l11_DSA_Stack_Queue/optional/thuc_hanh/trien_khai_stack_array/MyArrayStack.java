package l11_DSA_Stack_Queue.optional.thuc_hanh.trien_khai_stack_array;

public interface MyArrayStack {
    int size();
    void push(int element);
    int pop() throws Exception;
    int top();
    boolean isEmpty();
    boolean isFull();
}
