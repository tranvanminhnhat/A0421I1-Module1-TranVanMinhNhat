package l12_java_collection_framework.optional.exercise.inorder_preorder_postorder_binary_search_tree;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> implements TreeADT<T>{
    private int numNode = 0;
    private TreeNode root = null;

    @Override
    public boolean isEmpty() {
        return this.numNode == 0;
    }

    @Override
    public int size() {
        return this.numNode;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public boolean contains(T element) {
        return contains(root, element);
    }

    @Override
    public boolean remove(T element) {
        if (!contains(element)){
            return false;
        }
        root = remove(root, element);
        numNode--;
        return true;
    }

    @Override
    public boolean add(T element) {
        if (contains(element)){
            return false;
        }
        numNode++;
        root = add(root,element);
        return true;
    }

    @Override
    public Iterator<T> traverse(TreeTraverseType type) {
        switch (type){
            case PRE_ORDER:
                return preOrderTraverse();
            case IN_ORDER:
                return inOrderTraverse();
//            case POST_ORDER:
//                return postOrderTraverse();
//            case LEVEL_ORDER:
//                return levelOrderTraverse();
            default:
                return null;
        }
    }

//    private Iterator<T> levelOrderTraverse(){
//    }

    private Iterator<T> preOrderTraverse(){
        final int expectedCount = numNode;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedCount != numNode){
                    throw new ConcurrentModificationException();
                }
                return root != null && stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedCount != numNode){
                    throw new ConcurrentModificationException();
                }
                TreeNode node = stack.pop();
                if (node.getRight() != null){
                    stack.push(node.getRight());
                }
                return (T)node.getData();
            }
        };
    }

    private Iterator<T> inOrderTraverse(){
        final int expectedCount = numNode;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        return new Iterator<T>() {
            TreeNode trav = root;
            @Override
            public boolean hasNext() {
                if (expectedCount != numNode){
                    throw new ConcurrentModificationException();
                }
                return root != null && stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedCount != numNode){
                    throw new ConcurrentModificationException();
                }
                while (trav != null && trav.getLeft() != null){
                    stack.push(trav.getLeft());
                    trav = trav.getLeft();
                }

                TreeNode node = stack.pop();

                if (node.getRight() != null){
                    stack.push(node.getRight());
                    trav = node.getRight();
                }
                return (T)node.getData();
            }
        };
    }

//    private Iterator<T> postOrderTraverse(){
//    }




    //private height()
    private int height(TreeNode node){
        if (node == null){
            return 0;
        }
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

    //private contains
    private boolean contains(TreeNode node, T element){
        if (node == null){
            return false;
        }
        int result = element.compareTo((T)node.getData());

        if (result < 0){
            return contains(node.getLeft(), element);
        }else if (result > 0){
            return contains(node.getRight(), element);
        }else {
            return true;
        }
    }

    //private add()
    private TreeNode add(TreeNode node, T element){
        if (node == null){
            node = new TreeNode(element, null, null);
        }else {
            if (element.compareTo((T)node.getData()) > 0){
                node.setRight(add(node.getRight(), element));
            }else {
                node.setLeft(add(node.getLeft(), element));
            }
        }
        return node;
    }

    //private remove()
    private TreeNode remove(TreeNode node, T element){
        int result = element.compareTo((T)node.getData());
        if (result > 0){
            node.setRight(remove(node.getRight(), element));
        }else if (result < 0){
            node.setLeft(remove(node.getLeft(), element));
        }else {
            if (node.getLeft() == null){
                TreeNode rightNode = node.getRight();

                node.setData(null);
                node = null;
                return rightNode;
            }else if (node.getRight() == null){
                TreeNode leftNode = node.getLeft();

                node.setData(null);
                node = null;
                return leftNode;
            }else {
                T temp = minRight(node);
                node.setData(temp);
                node.setRight(remove(node.getRight(), temp));
            }
        }
        return node;
    }

    private T minRight(TreeNode node) {
        while (node.getLeft() != null){
            node = node.getLeft();
        }
        return (T)node.getData();
    }

    private T maxLeft(TreeNode node){
        while (node.getRight() != null){
            node = node.getRight();
        }
        return (T)node.getData();
    }
}
