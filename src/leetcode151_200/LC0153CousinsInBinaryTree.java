package leetcode151_200;

import jdk.nashorn.internal.ir.CallNode;
import utils.TreeNode;
//在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
//
//如果二叉树的两个节点深度相同，但 父节点不同 ，则它们是一对堂兄弟节点。
//
//我们给出了具有唯一值的二叉树的根节点 root ，以及树中两个不同节点的值 x 和 y 。
//
//只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true 。否则，返回 false。
public class LC0153CousinsInBinaryTree {
    //x的信息
    int x;
    int xDepth;
    TreeNode xParent;
    boolean xFound;

    //y的信息
    int y;
    int yDepth;
    TreeNode yParent;
    boolean yFound;

    public boolean isCousins(TreeNode root,int x,int y){
        this.x = x;
        this.y = y;
        dfs(root,0,null);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode root, int depth,TreeNode parent) {
        if (root==null)
            return;
        if (root.val==x){
            xDepth = depth;
            xParent = parent;
            xFound = true;
        }else if(root.val==y){
            yDepth = depth;
            yParent = parent;
            yFound = true;
        }

        if (xFound&&yFound)
            return;

        dfs(root.left,depth+1,root);

        if (xFound&&yFound)
            return;

        dfs(root.right,depth+1,root);
    }

}
