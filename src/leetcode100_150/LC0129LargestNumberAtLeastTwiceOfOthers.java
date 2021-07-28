package leetcode100_150;
//给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
//
//请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
public class LC0129LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        int max = 0;
        int sec_max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                sec_max = max;
                max = nums[i];
                index = i;
            }else if(nums[i]>sec_max){
                sec_max = nums[i];
            }
        }
        return max>=2*sec_max?index:-1;
    }



    public static void getTwo(int[] nums) {
        int max = 0;
        int sec_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                sec_max = max;
                max = nums[i];
            }else if (nums[i]>sec_max){
                sec_max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
    }

    public static void getThree(int[] nums){
        int max = 0;
        int sec_max = 0;
        int thrid_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                sec_max = max;
                max = nums[i];
            }else if (nums[i]>sec_max){
                thrid_max = sec_max;
                sec_max = nums[i];
            }else if (nums[i]>thrid_max){
                thrid_max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
        System.out.println(thrid_max);
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,9,8};
        getThree(ints);
    }
}
