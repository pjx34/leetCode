package leetcode151_200;
//给定一个非负整数数组 A，返回一个数组，在该数组中，?A 的所有偶数元素之后跟着所有奇数元素。
//
//你可以返回满足此条件的任何数组作为答案。
//示例：
//
//输入：[3,1,2,4]
//输出：[2,4,3,1]
//输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
public class LC0194SortArrayByParity {

    //左右双指针
    public int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        int righ = nums.length-1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                res[left] = nums[i];
                left++;
            }else {
                res[righ] = nums[i];
                righ--;
            }
        }
        return res;
    }

    //快速排序
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, righ = nums.length-1;
        while (left<righ){
            if (nums[left]%2>nums[righ]%2){
                int tmp = nums[left];
                nums[left] = nums[righ];
                nums[righ] = tmp;
            }
            if (nums[left]%2==0)
                left++;
            if (nums[righ]%2==1)
                righ--;
        }
        return nums;
    }
}
