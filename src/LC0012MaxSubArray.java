//最大子序和
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

import java.util.Arrays;

public class LC0012MaxSubArray {
    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = maxSubArray(ints);
        System.out.println(res);
    }



    public static int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maxSubArray = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            //sum要想有资格继续壮大 就必须大于 0 否则还不如恢复0
            sum = Math.max(sum,0);
            sum += nums[i];
            //maxSubArray始终取最大值
            maxSubArray = Math.max(sum,maxSubArray);
        }
        return maxSubArray;
    }
}
