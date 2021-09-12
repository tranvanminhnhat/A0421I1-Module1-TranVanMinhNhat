package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan_cua_toi;

public class BST<T extends Comparable<T>> implements BSTADT<T>{
    private TreeNode root = null;
    private int size = 0;

    public BST() {
    }

    @Override
    public boolean search(T element) {
        return search(root, element);
    }

    @Override
    public boolean insert(T element) {
        if (search(element)){
            return false;
        }else {
            size++;
            root = insert(root, element);
            return true;
        }
    }

    @Override
    public boolean remove(T element) {
        if (!search(element)){
            return false;
        }
        remove(root, element);
        size--;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode node){
        if (node == null){
            return;
        }
        inorder(node.getLeft());
        System.out.print(node.getData() + " ");
        inorder(node.getRight());
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    protected void preorder(TreeNode node){
        if (node == null){
            return;
        }
        System.out.print(node.getData() + " ");
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void postorder(TreeNode node){
        if (node == null){
            return;
        }
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    //search
    private boolean search(TreeNode node, T element){
        if (node == null){
            return false;
        }
        int result = element.compareTo((T)node.getData());
        if (result < 0){
            return search(node.getLeft(), element);
        }else if (result > 0){
            return search(node.getRight(), element);
        }else {
            return true;
        }
    }

    //insert
    private TreeNode insert(TreeNode node, T element){
        if (node == null){
            node = new TreeNode(element, null, null);
        }else {
            if (element.compareTo((T)node.getData()) > 0){
                node.setRight(insert(node.getRight(), element));
            }else{
                node.setLeft(insert(node.getLeft(), element));
            }
        }
        return node;
    }

    //remove
    private TreeNode remove(TreeNode node, T element){
        TreeNode temp;
        if (node.getLeft() == null){
            if (node.getRight() == null){
                temp = node;
                node.setData(null);
                node = null;
                return temp;
            }else {
                temp = node;
                TreeNode rightNode = node.getRight();
                node.setData(null);
                node = null;
                return temp;
            }
        }
        if (node.getRight() == null){
            if (node.getLeft() == null){
                temp = node;
                node.setData(null);
                node = null;
                return temp;
            }else {
                temp = node;
                TreeNode leftNode = node.getLeft();
                node.setData(null);
                node = null;
                return temp;
            }
        }
        T tempp = minRight(node);
        node.setData(tempp);
        node.setRight(remove(node.getRight(), tempp));
        return node;
    }

    private T minRight(TreeNode node) {
        while (node.getLeft() != null){
            node = node.getLeft();
        }
        return (T)node.getData();
    }
}
