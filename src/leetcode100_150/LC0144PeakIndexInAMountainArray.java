package leetcode100_150;
//符合下列属性的数组 arr 称为 山脉数组 ：
//arr.length >= 3
//存在 i（0 < i?< arr.length - 1）使得：
//arr[0] < arr[1] < ... arr[i-1] < arr[i]
//arr[i] > arr[i+1] > ... > arr[arr.length - 1]
//给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
//示例 1：
//
//输入：arr = [0,1,0]
//输出：1
public class LC0144PeakIndexInAMountainArray {
    //顺序遍历
    public int peakIndexInMountainArray1(int[] arr) {
        for (int i = 0; i+1 < arr.length; i++) {
            if (arr[i]>arr[i+1])
                return i;
        }
        return -1;
    }

    //二分法
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int res = 0;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]>arr[mid+1]){
                res = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
}
