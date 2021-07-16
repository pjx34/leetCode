//ºóÐø±éÀú

import java.util.ArrayList;
import java.util.List;

public class LC0033BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList list = new ArrayList<TreeNode>();
        postOrder(root,list);
        return list;
    }

    public void postOrder(TreeNode node,List res) {
        if (node == null)
            return;
        postOrder(node.left,res);
        postOrder(node.right,res);
        res.add(node.val);
    }
}
