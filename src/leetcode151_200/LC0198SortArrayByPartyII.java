package leetcode151_200;

import java.util.Arrays;

//给定一个非负整数数组?A， A 中一半整数是奇数，一半整数是偶数。
//
//对数组进行排序，以便当?A[i] 为奇数时，i?也是奇数；当?A[i]?为偶数时， i 也是偶数。
//
//你可以返回任何满足上述条件的数组作为答案。
public class LC0198SortArrayByPartyII {
    public static int[] sortArrayByParityII1(int[] nums) {
        int p1 = 0;//偶数下标
        int p2 = 0;//奇数下标
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                while (nums[p1]%2!=0){
                    p1++;
                }
                res[i] = nums[p1];
                p1++;
            }else{
                while (nums[p2]%2==0){
                    p2++;
                }
                res[i] = nums[p2];
                p2++;
            }
        }
        return res;
    }

    //双指针，一个奇数，一个偶数，遇到奇数或者偶数+2即可。
    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int pOdd = 0;
        int pEven = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                res[pOdd] = nums[i];
                pOdd+=2;
            }else{
                res[pEven] = nums[i];
                pEven += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {4, 2, 5, 7};
        int[] ints1 = sortArrayByParityII(ints);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }
    }
}
