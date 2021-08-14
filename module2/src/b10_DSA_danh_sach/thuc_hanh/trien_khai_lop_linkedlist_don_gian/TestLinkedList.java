package b10_DSA_danh_sach.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.addFirst(1);
        linkedList.add(1, 2);
        linkedList.printList();
    }
}
