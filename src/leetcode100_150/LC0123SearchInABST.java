package leetcode100_150;

import utils.TreeNode;

//
//����������������BST���ĸ��ڵ��һ��ֵ�� ����Ҫ��BST���ҵ��ڵ�ֵ���ڸ���ֵ�Ľڵ㡣 �����Ըýڵ�Ϊ���������� ����ڵ㲻���ڣ��򷵻� NULL��
public class LC0123SearchInABST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null||root.val==val)
            return root;
        return root.val>val?searchBST(root.left,val):searchBST(root.right,val);
    }
}
