package leetcode100_150;
//����һ�� N �������ҵ��������ȡ�
//
//��������ָ�Ӹ��ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�������
//
//N �������밴����������л���ʾ��ÿ���ӽڵ��ɿ�ֵ�ָ�����μ�ʾ������

import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class LC0104MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        if (null == root) {
            return 0;
        }
        int result = 1;
        for (Node child : root.children) {
            result = Math.max(result, 1 + maxDepth(child));
        }
        return result;
    }
}
