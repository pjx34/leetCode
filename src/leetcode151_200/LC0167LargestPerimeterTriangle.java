package leetcode151_200;

import java.util.Arrays;

//给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
//如果不能形成任何面积不为零的三角形，返回?0。
//示例 1：
//输入：[2,1,2]
//输出：5
public class LC0167LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=2; i--) {
            if (nums[i]<nums[i-1]+nums[i-2])
                return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}
