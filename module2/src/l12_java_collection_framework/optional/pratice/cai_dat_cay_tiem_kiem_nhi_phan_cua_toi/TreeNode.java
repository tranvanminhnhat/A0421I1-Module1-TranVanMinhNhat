package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan_cua_toi;

public class TreeNode<T> {
    private T data;
    private TreeNode<T> right;
    private TreeNode<T> left;

    public TreeNode() {
    }

    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }
}
