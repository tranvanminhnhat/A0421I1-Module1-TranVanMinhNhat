package l11_DSA_Stack_Queue.exercise.trien_khai_queue_circular_linked_list;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.deQueue();
        System.out.println(myQueue.size());
    }
}
