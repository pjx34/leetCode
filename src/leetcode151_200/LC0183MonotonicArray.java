package leetcode151_200;
//如果数组是单调递增或单调递减的，那么它是单调的。
//如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
//当给定的数组 A?是单调数组时返回 true，否则返回 false。
//示例 1：
//
//输入：[1,2,2,3]
//输出：true
public class LC0183MonotonicArray {

    //通过首尾元素确定单增或单减
    public boolean isMonotonic1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[0]<=nums[len-1]){
                if (nums[i]>nums[i+1])
                    return false;
            }else{
                if (nums[i]<nums[i+1])
                    return false;
            }
        }
        return true;
    }

    //同时单增单减则返回false
    public boolean isMonotonic(int[] nums) {
        boolean isAsc = true;
        boolean isDesc = true;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[i]>nums[i+1])
                isAsc = false;
            if (nums[i]<nums[i+1])
                isDesc = false;
        }
        return isAsc||isDesc;
    }


}
