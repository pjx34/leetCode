package leetcode100_150;

import utils.TreeNode;
//����һ�������������ĸ��ڵ� root ������ ������������ͬ�ڵ�ֵ֮�����С��ֵ ��
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
