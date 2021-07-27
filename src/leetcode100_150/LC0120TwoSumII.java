package leetcode100_150;

import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;

//给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
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
