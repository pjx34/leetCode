package leetcode100_150;

import java.util.Arrays;

//给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
public class LC0115MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (nums[0]>0||(nums[0]<0&&nums[1]>0))
            return nums[len-1]*nums[len-2]*nums[len-3];
       // if (nums[0]<0&&nums[1]<0)
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3],nums[0]*nums[1]*nums[len-1]);
    }
}
