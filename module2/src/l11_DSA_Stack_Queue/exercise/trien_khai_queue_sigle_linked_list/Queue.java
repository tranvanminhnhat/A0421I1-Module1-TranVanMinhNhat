package l11_DSA_Stack_Queue.exercise.trien_khai_queue_sigle_linked_list;

public class Queue<T> implements MyQueue<T>{
    private Node head;
    private Node tail;
    private int size = 0;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void enQueue(Object element) {
        Node temp = new Node(element,null);
        if (isEmpty()){
            head = tail = temp;
            size++;
            return;
        }
        this.tail.setNext(temp);
        this.tail = this.tail.getNext();
        size++;
    }

    @Override
    public T deQueue() {
        if (isEmpty()){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        if (isEmpty()){
            this.tail = null;
        }
        size--;
        return (T) temp.getData();
    }

    @Override
    public T peek() {
        return (T) this.head.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null){
            return true;
        }
        return false;
    }
}
