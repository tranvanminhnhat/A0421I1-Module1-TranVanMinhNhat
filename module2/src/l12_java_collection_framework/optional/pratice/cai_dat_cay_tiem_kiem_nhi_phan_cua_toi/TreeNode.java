package l12_java_collection_framework.optional.pratice.cai_dat_cay_tiem_kiem_nhi_phan_cua_toi;

public class TreeNode<T> {
    private T data;
    private TreeNode right;
    private TreeNode left;

    public TreeNode() {
    }

    public TreeNode(T data, TreeNode left, TreeNode right) {
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

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
}
