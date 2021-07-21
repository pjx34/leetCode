import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

//����������ĸ��ڵ� root ���������ڵ�ֵ�� ǰ�� ������
public class LC0032BinaryTreePreorderTraversal {


    public static List<Integer> preorderTraversal(TreeNode root) {
        List list = new ArrayList<TreeNode>();
        preOrder(root,list);
        return list;
    }

    public static void preOrder(TreeNode node,List res) {
        if (node==null)
            return;
        res.add(node.val);
        preOrder(node.left,res);
        preOrder(node.right,res);
    }
}
