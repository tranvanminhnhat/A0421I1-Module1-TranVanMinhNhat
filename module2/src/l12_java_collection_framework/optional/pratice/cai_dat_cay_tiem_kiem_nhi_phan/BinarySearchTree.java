package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    private int size = 0;

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = new TreeNode<>(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0){
                parent.left = new TreeNode<>(e);
            }else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public BinarySearchTree(){
    }

    public BinarySearchTree(E[] objects){
        for (int i = 0; i < objects.length; i++){
            insert(objects[i]);
        }
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
