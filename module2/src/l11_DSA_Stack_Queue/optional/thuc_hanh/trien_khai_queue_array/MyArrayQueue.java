package l11_DSA_Stack_Queue.optional.thuc_hanh.trien_khai_queue_array;

public interface MyArrayQueue<E> {
    boolean isfull();
    boolean isEmpty();
    int size();
    E peek();
    void enQueue(E element);
    E deQueue();
}
