//������� �ȱ���������->���ڵ�->������
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

//*Definition for a binary tree node.


class Solution {
    static ArrayList<Integer>  list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root != null){
            list.add(root.val);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
        return list;
    }
}

class LC0020InorderTraversal {
}
