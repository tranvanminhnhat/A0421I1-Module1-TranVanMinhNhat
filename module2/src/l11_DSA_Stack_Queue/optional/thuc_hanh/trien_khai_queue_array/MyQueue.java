package l11_DSA_Stack_Queue.optional.thuc_hanh.trien_khai_queue_array;

import org.omg.CORBA.Object;

public class MyQueue<E> implements MyArrayQueue<E>{
    private int size;
    private int arrayCapacity;
    private int head;
    private int tail;
    private E[] arrQueue;

    public MyQueue(int arrayCapacity) {
        this.size = 0;
        this.head = 0;
        this.tail = -1;
        this.arrayCapacity = arrayCapacity;
        arrQueue = (E[]) new Object[this.arrayCapacity];
    }

    @Override
    public boolean isfull() {
        if (this.size == this.arrayCapacity){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void enQueue(E element) {
        if (isfull()){
            System.out.println("Overflow ! Unable to add element: " + element);
            return;
        }
        tail++;
        if (tail == arrayCapacity-1){
            tail = 0;
        }
        arrQueue[tail] = element;
        size++;
    }

    @Override
    public E deQueue() {
        if (isEmpty()){
            System.out.println("The queue is empty!");
        }
        E temp = arrQueue[head];
        head++;
        if (head == arrayCapacity-1){
            head = 0;
        }
        size--;
        return temp;
    }
}
