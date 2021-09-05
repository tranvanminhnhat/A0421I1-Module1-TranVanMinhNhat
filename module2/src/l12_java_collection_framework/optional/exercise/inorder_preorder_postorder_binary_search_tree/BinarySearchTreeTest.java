package l12_java_collection_framework.optional.exercise.inorder_preorder_postorder_binary_search_tree;

import java.util.Iterator;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        TreeADT<Integer> bst = new BinarySearchTree<>();
        bst.add(112);
        bst.add(13333);
        bst.add(1111);
        bst.add(12);
        bst.add(1555);
        bst.add(11);
        bst.add(13);

        Iterator traverse = bst.traverse(TreeTraverseType.IN_ORDER);
        while (traverse.hasNext()){
            System.out.println(traverse.next());
        }

        System.out.println(bst.height());
        System.out.println(bst.contains(12));
        System.out.println(bst.remove(1111));
    }
}
