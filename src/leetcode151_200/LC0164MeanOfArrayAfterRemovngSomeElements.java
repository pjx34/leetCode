package leetcode151_200;

import java.util.Arrays;

//给你一个整数数组 arr ，请你删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
// 与 标准答案 误差在 10-5 的结果都被视为正确结果。
public class LC0164MeanOfArrayAfterRemovngSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length/20; i <arr.length-arr.length/20 ; i++) {
            sum += arr[i];
        }
        return sum/(0.9*arr.length);
    }
}
