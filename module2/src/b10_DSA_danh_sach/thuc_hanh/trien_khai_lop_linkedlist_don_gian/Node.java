package b10_DSA_danh_sach.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class Node {
    protected Node next;
    protected Object data;

    public Node (Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }
}
