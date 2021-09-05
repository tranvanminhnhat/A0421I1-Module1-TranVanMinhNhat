package l10_DSA_list.practice.trien_khai_lop_linkedlist_don_gian;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.addFirst(1);
        linkedList.add(1, 2);
        linkedList.printList();
    }
}
