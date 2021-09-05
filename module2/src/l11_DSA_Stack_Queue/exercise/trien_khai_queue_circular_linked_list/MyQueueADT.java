package l11_DSA_Stack_Queue.exercise.trien_khai_queue_circular_linked_list;

public interface MyQueueADT<E> {
    void enQueue(E element);
    E deQueue();
    int size();
    boolean isEmpty();
}
