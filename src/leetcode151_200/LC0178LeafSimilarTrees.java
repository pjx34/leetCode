package leetcode151_200;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC0178LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getList(root1,list1);
        getList(root2,list2);
        if (list1.size()!=list2.size())
            return false;
        for (int i = 0; i < list1.size() ; i++) {
            if (!list1.get(i).equals(list2.get(i)))
                return false;
        }
        return true;
    }

    private void getList(TreeNode root1,List list) {
        if (root1==null)
            return ;
        getList(root1.left,list);
        if (root1.left==null&&root1.right==null)
            list.add(root1.val);
        getList(root1.right,list);
    }
}
