package l11_DSA_Stack_Queue.exercise.trien_khai_queue_sigle_linked_list;

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
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
