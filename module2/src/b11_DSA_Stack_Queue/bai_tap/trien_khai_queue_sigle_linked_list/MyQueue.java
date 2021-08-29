package b11_DSA_Stack_Queue.bai_tap.trien_khai_queue_sigle_linked_list;

public interface MyQueue<T> {
    void enQueue(T element);
    T deQueue();
    T peek();
    int size();
    boolean isEmpty();
}
