package leetcode100_150;

import java.util.ArrayList;
import java.util.List;

//����һ�� N ������������ڵ�ֵ�� ������� ��
//
//N ���� �������а���������������л���ʾ��ÿ���ӽڵ��ɿ�ֵ null �ָ�����μ�ʾ������
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
