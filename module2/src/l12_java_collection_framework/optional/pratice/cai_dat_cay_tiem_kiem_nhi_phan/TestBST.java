package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(9);
        tree.insert(12);
        tree.insert(-5);
        System.out.println("Inorder (sorted):");
        tree.inorder();
        System.out.println("the number of nodes is: " + tree.getSize());
    }
}
