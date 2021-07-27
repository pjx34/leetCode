package leetcode100_150;

import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;

//����һ������������ root ��һ��Ŀ���� k����� BST �д�������Ԫ�������ǵĺ͵��ڸ�����Ŀ�������򷵻� true��
public class LC0120TwoSumII {
    public boolean findTarget(TreeNode root, int k) {
        List list = TreeNodeUtils.midOrderList(root);
        list.sort((a,b)->(int)a-(int)b);
        int low = 0;
        int high = list.size()-1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() ; j++) {
                if ((int)list.get(i)+(int)list.get(j)==k)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        list.sort((a,b)->(int)b-(int)a);
        System.out.println(list);
    }
}
