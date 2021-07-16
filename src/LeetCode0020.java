//中序遍历 先遍历左子树->根节点->右子树
import java.util.ArrayList;
import java.util.List;

//*Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null){
            list.add(root.val);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
        return list;
    }
}

public class LeetCode0020 {
}
