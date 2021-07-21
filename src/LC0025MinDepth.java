//给定一个二叉树，找出其最小深度。最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

import utils.TreeNode;

public class LC0025MinDepth {


    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right ==null)
            return 1;
        int min = Integer.MAX_VALUE;
        if (root.left!=null)
            min = Math.min(min,minDepth(root.left));
        if (root.right!=null)
            min = Math.min(min,minDepth(root.right));
        return min+1;
    }
}
