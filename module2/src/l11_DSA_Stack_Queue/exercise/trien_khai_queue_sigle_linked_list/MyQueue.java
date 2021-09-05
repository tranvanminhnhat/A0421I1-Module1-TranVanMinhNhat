package l11_DSA_Stack_Queue.exercise.trien_khai_queue_sigle_linked_list;

public interface MyQueue<T> {
    void enQueue(T element);
    T deQueue();
    T peek();
    int size();
    boolean isEmpty();
}
