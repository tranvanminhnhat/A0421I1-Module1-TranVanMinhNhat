package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan_cua_toi;

public interface BSTADT<T extends Comparable<T>> {
    boolean search(T element);
    boolean insert(T element);
    boolean remove(T element);
    void inorder();
    void preorder();
    void postorder();
    boolean isEmpty();
    int getSize();
}
