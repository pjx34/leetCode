
//给你两个有序整数数组?nums1 和 nums2，请你将 nums2 合并到?nums1?中，使 nums1 成为一个有序数组。
//初始化?nums1 和 nums2 的元素数量分别为?m 和 n 。你可以假设?nums1 的空间大小等于?m + n，这样它就有足够的空间保存来自 nums2 的元素。

import java.util.Arrays;

public class LeetCode0019 {



    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int[] tmp = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int cur;
        while (p1<m||p2<n){
            if (p1==m){
                tmp[p3++] = nums2[p2++];
            }else if(p2==n){
                tmp[p3++] = nums2[p1++];
            }
            else if (nums1[p1]<nums2[p2]){
                tmp[p3++] = nums1[p1++];
            }else{
                tmp[p3++] = nums2[p2++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = tmp[i];
        }
        Arrays.sort(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }


    public static void main(String[] args) {
        int[] ints1 = {1};
        int[] ints2 = {};
        merge(ints1,1,ints2,0);
        System.out.println(Arrays.toString(ints1));
    }
}
