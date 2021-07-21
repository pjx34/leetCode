//给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。

import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.List;

public class LC0024SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        // 左右等分建立左右子树，中间节点作为子树根节点，递归该过程
        return nums == null?null:buildTree(nums,0,nums.length-1);
    }

    private static TreeNode buildTree(int[] nums,int l,int r) {
        if (l>r){
            return null;
        }
        int mid = (l + r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,l,mid-1);
        root.right = buildTree(nums,mid+1,r);
        return root;
    }

    public static void main(String[] args) {
        int[] ints = {0,2,3,4,5,6,7,8,9};
        TreeNode treeNode = sortedArrayToBST(ints);
        List list = TreeNodeUtils.midOrderList(treeNode);
        System.out.println(list);
        List<Integer> list1 = TreeNodeUtils.preOrderList(treeNode);
        System.out.println(list1);

    }


}
