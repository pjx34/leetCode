package leetcode151_200;

import utils.TreeNode;

import java.util.ArrayList;

//给你一棵二叉搜索树，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
public class LC0184IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        midOrder(root,res);

        TreeNode dummyHead = new TreeNode(-1);
        TreeNode current = dummyHead;
        for (Integer re : res) {
            current.right = new TreeNode(re);
            current = current.right;
        }
        return dummyHead.right;
    }

    private void midOrder(TreeNode root, ArrayList<Integer> res) {
        if (root==null)
            return;
        midOrder(root.left,res);
        res.add(root.val);
        midOrder(root.right,res);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 70; i <=250 ; i+=10) {
            sb.append("QJGTGD==").append(i).append("||");
        }
        System.out.println(sb.toString());
    }

}
