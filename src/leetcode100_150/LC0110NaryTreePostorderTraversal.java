package leetcode100_150;

import java.util.ArrayList;
import java.util.List;

//给定一个 N 叉树，返回其节点值的 后序遍历 。
//
//N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
public class LC0110NaryTreePostorderTraversal {
    List list = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        getList(root);
        return list;
    }

    private void getList(Node root) {
        if (root==null)
            return;
        for (Node child : root.children) {
            getList(child);
        }
        list.add(root.val);
    }
}
