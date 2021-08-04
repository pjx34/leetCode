package leetcode151_200;
//给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
//
//如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
//
//0 <= i < j < k <?arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//其中 |x| 表示 x 的绝对值。
//
//返回 好三元组的数量 。
public class LC0162CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int _a = Math.abs(arr[i]-arr[j]);
                    int _b = Math.abs(arr[j]-arr[k]);
                    int _c = Math.abs(arr[i]-arr[k]);
                    if (_a<=a&&_b<=b&&_c<=c)
                        count++;
                }
            }
        }
        return count;
    }
}
