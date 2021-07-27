import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;

//给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
public class LC0099MinimumAbsoluteDifferenceInBST {

    //遍历
    public static int getMinimumDifference1(TreeNode root) {
        List list = midOrderList(root);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (Math.abs((int)list.get(i)-(int)list.get(j))<min){
                    min = Math.abs((int)list.get(i)-(int)list.get(j));
                }
            }
        }
        return min;
    }

    //中序遍历 返回list
    public static List midOrderList(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        midOrderList1(root,list);
        return list;
    }

    public static void midOrderList1(TreeNode root,List list){
        if (root==null)
            return;
        midOrderList1(root.left,list);
        list.add(root.val);
        midOrderList1(root.right,list);
    }

    int res = Integer.MAX_VALUE;
    int pre = -1;
    //遍历
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root==null)
            return;
        dfs(root.left);
        if (pre==-1)
            pre = root.val;
        else{
            res = Math.min(res,Math.abs(root.val-pre));
            pre = root.val;
        }
        dfs(root.right);
    }




    public static void main(String[] args) {
        int[] ints = {236,104,701,227,911};
        TreeNode treeNode = TreeNodeUtils.sortedArrayToBST(ints);
        TreeNodeUtils treeNodeUtils = new TreeNodeUtils();
        List list = treeNodeUtils.midOrderList(treeNode);
        System.out.println(list);
    }
}
