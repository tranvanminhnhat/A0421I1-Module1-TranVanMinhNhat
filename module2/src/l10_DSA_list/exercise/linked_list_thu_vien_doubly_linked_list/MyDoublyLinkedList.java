package l10_DSA_list.exercise.linked_list_thu_vien_doubly_linked_list;

public class MyDoublyLinkedList<E> {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public MyDoublyLinkedList() {

    }

    public void addFirst(E element){
        Node temp;
        if (isEmpty()){
            temp = new Node(element, null, null);
            head = tail = temp;
            size++;
        }else {
            temp = new Node(element, null,head);
            head.setPre(temp);
            head = head.getPre();
            size++;
        }
    }

    public void addLast(E element){
        Node temp;
        if (isEmpty()){
            temp = new Node(element, null, null);
            head = tail = temp;
            size++;
        }else {
            temp = new Node(element, tail, null);
            tail.setNext(temp);
            tail = tail.getNext();
            size++;
        }
    }

    public E peekFirst(){
        if (isEmpty()){
            throw new RuntimeException("Empty linked list");
        }
        return (E) head.getData();
    }

    public E peekLast(){
        if (isEmpty()){
            throw new RuntimeException("Empty linked list");
        }
        return (E) tail.getData();
    }

    public void add(int index, E element){

    }

    public E removeFirst(){
        if (isEmpty()){
            throw new RuntimeException("Empty linked list");
        }
        E data = (E) head.getData();
        head = head.getNext();
        size--;
        if (isEmpty()){
            tail = null;
        }else {
            head.setPre(null);
        }
        return data;
    }

    public E removeLast(){
        if (isEmpty()){
            throw new RuntimeException("Empty linked list");
        }
        E data = (E) head.getData();
        tail = tail.getPre();
        size--;
        if (isEmpty()){
            head = null;
        }else {
            tail.setNext(null);
        }
        return data;
    }

    public E remove(Node node){
        if (node.getPre() == null){
            this.removeFirst();
        }
        if (node.getNext() == null){
            this.removeLast();
        }
        node.getPre().setNext(node.getNext());
        node.getNext().setPre(node.getPre());

        E data = (E) node.getData();
        size--;

        node.setPre(null);
        node.setNext(null);
        node.setData(null);

        return data;
    }

    public boolean remove(Object o){
        Node temp = head;
        if (o == null){
            while (temp != null){
                if (temp.getData() == null){
                    remove(temp);
                    return true;
                }
                temp = temp.getNext();
            }
        }else {
            while (temp != null){
                if (temp.getData() == o){
                    remove(temp);
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    public E removeAt(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        int i;
        Node temp;
        if (index < size/2){
            i = 0;
            temp = head;
            while (i != index){
                temp = temp.getNext();
                i++;
            }
        }else {
            i = size-1;
            temp = tail;
            while (i != index){
                temp = temp.getPre();
                i--;
            }
        }

        return remove(temp);
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public int size(){
        return this.size;
    }
}
