package leetcode100_150;

import java.util.Arrays;

//给定长度为?2n?的整数数组 nums ，你的任务是将这些数分成?n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到?n 的 min(ai, bi) 总和最大。
//
//返回该 最大总和 。
public class LC0105ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {6,2,6,5,1,2};
        int i = arrayPairSum(ints);
        System.out.println(i);
    }
}
