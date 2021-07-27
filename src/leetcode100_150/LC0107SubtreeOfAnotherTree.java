package leetcode100_150;

import utils.TreeNode;

//给你两棵二叉树 root 和 subRoot 。检验 root 中是否包含和 subRoot 具有相同结构和节点值的子树。如果存在，返回 true ；否则，返回 false 。
//
//二叉树 tree 的一棵子树包括 tree 的某个节点和这个节点的所有后代节点。tree 也可以看做它自身的一棵子树。
public class LC0107SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode node1,TreeNode node2) {
        if (node1==null)
            return false;
        return check(node1,node2) ||dfs(node1.left,node2) ||dfs(node1.right,node2);
    }

    //
    public boolean check(TreeNode node1,TreeNode node2) {
        if (node1==null&&node2==null)
            return true;
        if (node1==null||node2==null||node1.val!=node2.val)
            return false;
        return check(node1.left,node2.left) && check(node1.right,node2.right);
    }
}
