package b11_DSA_Stack_Queue.bai_tap.trien_khai_queue_circular_linked_list;

public class Node<E> {
    private E data;
    private Node next;

    public Node() {
    }

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
