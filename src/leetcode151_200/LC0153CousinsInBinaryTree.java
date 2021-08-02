package leetcode151_200;

import jdk.nashorn.internal.ir.CallNode;
import utils.TreeNode;
//�ڶ������У����ڵ�λ����� 0 ����ÿ�����Ϊ k �Ľڵ���ӽڵ�λ����� k+1 ����
//
//����������������ڵ������ͬ���� ���ڵ㲻ͬ ����������һ�����ֵܽڵ㡣
//
//���Ǹ����˾���Ψһֵ�Ķ������ĸ��ڵ� root ���Լ�����������ͬ�ڵ��ֵ x �� y ��
//
//ֻ����ֵ x �� y ��Ӧ�Ľڵ������ֵܽڵ�ʱ���ŷ��� true �����򣬷��� false��
public class LC0153CousinsInBinaryTree {
    //x����Ϣ
    int x;
    int xDepth;
    TreeNode xParent;
    boolean xFound;

    //y����Ϣ
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
