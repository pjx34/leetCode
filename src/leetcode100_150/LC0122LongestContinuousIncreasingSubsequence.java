package leetcode100_150;
//给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
//
//连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
//示例 1：
//
//输入：nums = [1,3,5,4,7]
//输出：3
public class LC0122LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int res = 1;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[i]<nums[i+1])
                res = Math.max(res,++count);//++count自己先加1,然后再进行下一步运算
            else
                count = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,5,4,2,3,4,5};
        int lengthOfLCIS = findLengthOfLCIS(ints);
        System.out.println(lengthOfLCIS);
    }
}
