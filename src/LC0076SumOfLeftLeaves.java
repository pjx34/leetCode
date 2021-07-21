//���������������������Ҷ��֮�͡�
//
//ʾ����
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//������������У���������Ҷ�ӣ��ֱ��� 9 �� 15�����Է��� 24
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
