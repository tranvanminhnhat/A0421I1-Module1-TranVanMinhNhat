package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan_cua_toi;

public class Test {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(2);
        bst.insert(12);
        bst.insert(3);
        bst.insert(5);
        bst.insert(333);
        bst.insert(-2);
        bst.remove(12);
        System.out.println( bst.search(2));
        System.out.println(bst.getSize());

        System.out.println("inorder: ");
        bst.inorder();
        System.out.println("preorder: ");
        bst.preorder();
        System.out.println("postorder: ");
        bst.postorder();

    }
}
