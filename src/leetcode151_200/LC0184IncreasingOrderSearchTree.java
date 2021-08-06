package leetcode151_200;

import utils.TreeNode;

import java.util.ArrayList;

//����һ�ö��������������� ��������� ������������Ϊһ�õ���˳����������ʹ��������ߵĽڵ��Ϊ���ĸ��ڵ㣬����ÿ���ڵ�û�����ӽڵ㣬ֻ��һ�����ӽڵ㡣
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
