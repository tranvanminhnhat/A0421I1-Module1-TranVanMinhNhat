package b11_DSA_Stack_Queue.bai_tap.trien_khai_queue_circular_linked_list;

public interface MyQueueADT<E> {
    void enQueue(E element);
    E deQueue();
    int size();
    boolean isEmpty();
}
