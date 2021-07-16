//����һ���������� nums ������Ԫ���Ѿ��� ���� ���У����㽫��ת��Ϊһ�� �߶�ƽ�� �������������߶�ƽ�� ��������һ�����㡸ÿ���ڵ���������������ĸ߶Ȳ�ľ���ֵ������ 1 ���Ķ�������

public class LeetCode0024 {
    public TreeNode sortedArrayToBST(int[] nums) {
        // ���ҵȷֽ��������������м�ڵ���Ϊ�������ڵ㣬�ݹ�ù���
        return nums == null?null:buildTree(nums,0,nums.length);
    }



    private TreeNode buildTree(int[] nums, int l, int r) {
        if (l>r) {
            return null;
        }
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,l,mid-1);
        root.right = buildTree(nums,mid+1,r);
        return root;
    }


}
