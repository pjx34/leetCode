import utils.TreeNode;

public class LC0051ReverseBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null)  {
            return null;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
