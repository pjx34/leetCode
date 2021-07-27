import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.ArrayList;
import java.util.List;

//����һ�����нڵ�Ϊ�Ǹ�ֵ�Ķ�����������������������������ڵ�Ĳ�ľ���ֵ����Сֵ��
public class LC0099MinimumAbsoluteDifferenceInBST {

    //����
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

    //������� ����list
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
    //����
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
