package leetcode100_150;

import utils.TreeNode;
//给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
public class LC0132MinDiffInBST {
    int pre = -1;
    int ans = 0;
    public int minDiffInBST(TreeNode root) {
        pre = -1;
        ans = Integer.MAX_VALUE;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root==null)
            return;
        dfs(root.left);
        if (pre==-1)
            pre = root.val;
        else{
            ans = Math.min(ans,root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}
