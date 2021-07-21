//计算给定二叉树的所有左叶子之和。
//
//示例：
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
//

import utils.TreeNode;

public class LC0076SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        return root==null?0:dfs(root);
    }

    public static int dfs(TreeNode root) {
        int sum = 0;
        if(root.left!=null){
            if(isLeaf(root.left))
                sum += root.left.val;
            else
                sum += dfs(root.left);
        }
        if (root.right!=null&&!isLeaf(root.right))
            sum += dfs(root.right);
        return sum;
    }

    public static boolean isLeaf(TreeNode node) {
        if (node!=null && node.left==null &&node.right==null)
            return true;
        return false;
    }

}
