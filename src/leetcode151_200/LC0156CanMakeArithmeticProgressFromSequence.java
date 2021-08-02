package leetcode151_200;

import java.util.Arrays;

//给你一个数字数组 arr 。
//如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
//如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false
public class LC0156CanMakeArithmeticProgressFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i+1 < arr.length; i++) {
            if (arr[i+1]-arr[i]!=arr[1]-arr[0])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        boolean b = canMakeArithmeticProgression(arr);
        System.out.println(b);
    }
}
