package l11_DSA_Stack_Queue.exercise.trien_khai_queue_circular_linked_list;

public class MyQueue<E> implements MyQueueADT<E>{
    private Node tail;
    private Node head;
    private int size = 0;

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enQueue(E element) {
        Node temp = new Node(element, null);
        if (isEmpty()){
            tail = head = temp;
            size++;
            return;
        }
        this.tail.setNext(temp);
        this.tail = this.tail.getNext();
        this.tail.setNext(head);
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        this.tail.setNext(head);
        size--;
        if (this.size == 0){
            this.head = null;
            this.tail = null;
        }
        return (E) temp.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0){
            return true;
        }
        return false;
    }


}
