package leetcode151_200;
//给你一个整数数组 nums 。
//如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
//返回好数对的数目。
//示例 1：
//输入：nums = [1,2,3,1,1,3]
//输出：4
//解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
public class LC0158NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == a)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3};
        int i = numIdenticalPairs(ints);
        System.out.println(i);
    }
}
