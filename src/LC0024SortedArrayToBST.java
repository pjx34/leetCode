//����һ���������� nums ������Ԫ���Ѿ��� ���� ���У����㽫��ת��Ϊһ�� �߶�ƽ�� �������������߶�ƽ�� ��������һ�����㡸ÿ���ڵ���������������ĸ߶Ȳ�ľ���ֵ������ 1 ���Ķ�������

import utils.TreeNode;
import utils.TreeNodeUtils;

import java.util.List;

public class LC0024SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        // ���ҵȷֽ��������������м�ڵ���Ϊ�������ڵ㣬�ݹ�ù���
        return nums == null?null:buildTree(nums,0,nums.length-1);
    }

    private static TreeNode buildTree(int[] nums,int l,int r) {
        if (l>r){
            return null;
        }
        int mid = (l + r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,l,mid-1);
        root.right = buildTree(nums,mid+1,r);
        return root;
    }

    public static void main(String[] args) {
        int[] ints = {0,2,3,4,5,6,7,8,9};
        TreeNode treeNode = sortedArrayToBST(ints);
        List list = TreeNodeUtils.midOrderList(treeNode);
        System.out.println(list);
        List<Integer> list1 = TreeNodeUtils.preOrderList(treeNode);
        System.out.println(list1);

    }


}
