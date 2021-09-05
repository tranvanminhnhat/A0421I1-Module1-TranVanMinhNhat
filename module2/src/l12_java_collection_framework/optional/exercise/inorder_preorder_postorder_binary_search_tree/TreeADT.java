package l12_java_collection_framework.optional.exercise.inorder_preorder_postorder_binary_search_tree;

import java.util.Iterator;

public interface TreeADT<T extends  Comparable<T>> {
    boolean isEmpty();
    int size();
    int height();
    boolean contains(T element);
    boolean remove(T element);
    boolean add(T element);
    Iterator<T> traverse(TreeTraverseType type);
}
