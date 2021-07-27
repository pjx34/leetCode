package leetcode100_150;
//����һ�� N ������������ڵ�ֵ�� ǰ����� ��
//
//N ���� �������а���������������л���ʾ��ÿ���ӽڵ��ɿ�ֵ null �ָ�����μ�ʾ������

import java.util.ArrayList;
import java.util.List;

public class LC0109NaryTreePreorderTraversal {
    List list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        getList(root);
        return list;
    }

    private void getList(Node root) {
        if (root==null)
            return;
        list.add(root.val);
        for (Node child : root.children) {
            getList(child);
        }
    }


}
