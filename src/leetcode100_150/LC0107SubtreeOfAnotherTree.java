package leetcode100_150;

import utils.TreeNode;

//�������ö����� root �� subRoot ������ root ���Ƿ������ subRoot ������ͬ�ṹ�ͽڵ�ֵ��������������ڣ����� true �����򣬷��� false ��
//
//������ tree ��һ���������� tree ��ĳ���ڵ������ڵ�����к���ڵ㡣tree Ҳ���Կ����������һ��������
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
