package leetcode100_150;
//给你一个整数数组?nums ，请计算数组的 中心下标 。
//数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
//如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
//如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

//示例 1：
//
//输入：nums = [1, 7, 3, 6, 5, 6]
//输出：3
//解释：
//中心下标是 3 。
//左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
//右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
public class LC0126FindPivotIndex {

    //遍历计算左右两边的和
    public static int pivotIndex1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += nums[j];
            }
            for (int j = i+1; j < nums.length ; j++) {
                sum2 += nums[j];
            }
            if (sum1==sum2)
                return i;
        }
        return -1;
    }

    //2*左边的和+中值=总和
    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum+nums[i]==total)
                return i;
            sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1,7,3,6,5,6};
        int index = pivotIndex(ints);
        System.out.println(index);
    }
}
