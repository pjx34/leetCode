package leetcode100_150;
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
//示例 1：
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100]
public class LC0147SquareOfASortedArray {
    //双指针1
    public int[] sortedSquares1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0,j=n-1,pos=n-1; i <= j ; ) {
            if (nums[i]*nums[i]>nums[j]*nums[j]){
                res[pos] = nums[i]*nums[i];
                i++;
            }else{
                res[pos] = nums[j]*nums[j] ;
                j--;
            }
            pos--;
        }
        return res;
    }

    //双指针2
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int p = len-1;
        int[] res = new int[len];
        while (left<=right){
            if (nums[left]*nums[left]>nums[right]*nums[right]){
                res[p] = nums[left]*nums[left];
                left++;
            }else{
                res[p] = nums[right]*nums[right];
                right--;
            }
            p--;
        }
        return res;
    }
}
