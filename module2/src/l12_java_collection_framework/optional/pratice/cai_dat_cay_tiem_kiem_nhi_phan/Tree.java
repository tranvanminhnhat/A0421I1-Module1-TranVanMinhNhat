package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan;

public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();
}
