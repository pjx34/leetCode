
//��������������������?nums1 �� nums2�����㽫 nums2 �ϲ���?nums1?�У�ʹ nums1 ��Ϊһ���������顣
//��ʼ��?nums1 �� nums2 ��Ԫ�������ֱ�Ϊ?m �� n ������Լ���?nums1 �Ŀռ��С����?m + n�������������㹻�Ŀռ䱣������ nums2 ��Ԫ�ء�

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
