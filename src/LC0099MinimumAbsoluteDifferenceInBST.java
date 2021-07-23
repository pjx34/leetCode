import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.List;

//����һ�����нڵ�Ϊ�Ǹ�ֵ�Ķ�����������������������������ڵ�Ĳ�ľ���ֵ����Сֵ��
public class LC0099MinimumAbsoluteDifferenceInBST {
    public static int getMinimumDifference(TreeNode root) {
        int min[] = new int[]{Integer.MAX_VALUE};
        midOrder(root,min);
        return min[0];
    }

    public static void midOrder(TreeNode root, int[] min) {
        if (root==null)
            return;
        midOrder(root.left,min);
        if (root.left!=null && Math.abs(root.val-root.left.val) <min[0])
            min[0] = Math.abs(root.val-root.left.val);
        if (root.right!=null && Math.abs(root.val-root.right.val)<min[0])
            min[0] = Math.abs(root.val-root.right.val);
        midOrder(root.right,min);
    }

    public static void main(String[] args) {
        int[] ints = {236,104,701,227,911};
        TreeNode treeNode = TreeNodeUtils.sortedArrayToBST(ints);
        int minimumDifference = getMinimumDifference(treeNode);
        System.out.println(minimumDifference);
    }
}
