package l10_DSA_list.exercise.linked_list_thu_vien_doubly_linked_list;

public class Node {
    private Object data;
    private Node pre;
    private Node next;

    public Node() {
    }

    public Node(Object data, Node pre, Node next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
