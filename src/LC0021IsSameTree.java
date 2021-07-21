//�������ö������ĸ��ڵ� p �� q ����дһ���������������������Ƿ���ͬ������������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�

import utils.TreeNode;

public class LC0021IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&q==null){
            return  true;
        }
        else if (p==null && q!=null)
            return false;
        else if (p!=null && q==null)
            return false;
        else if ((p!=null && q!=null)){
            if (p.val != q.val){
                return false;
            }
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(3);
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        boolean sameTree = isSameTree(treeNode1, treeNode4);
        System.out.println(sameTree);

    }
}


