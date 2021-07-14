//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
// 你可以假设数组中无重复元素。
public class LeetCode0011 {
    //方法一: 爆破
    public int searchInsert2(int[] nums, int target) {
        int res = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>= target) {
                res = i;
            }else{
                res =  nums.length;
            }
        }
        return res;
    }

    //方法二: 二分查找
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0,right = len-1;
        while (left<=right){
            int mid = left + (right - left)/2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
}
