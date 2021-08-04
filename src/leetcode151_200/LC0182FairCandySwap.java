package leetcode151_200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
//
//因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
//
//返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1]?是 Bob 必须交换的糖果棒的大小。
//
//如果有多个答案，你可以返回其中任何一个。保证答案存在。
//示例 1：
//
//输入：A = [1,1], B = [2,2]
//输出：[1,2]
public class LC0182FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> set = new HashSet<>();
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        int delta = (sum1-sum2)/2;
        for (int aliceSize : aliceSizes) {
            set.add(aliceSize);
        }
        for (int bobSize : bobSizes) {
            if (set.contains(bobSize+delta))
               return new int[]{bobSize+delta,bobSize};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] ints = {1,2,5};
        int[] ints1 = {2,4};
        int[] res = fairCandySwap(ints, ints1);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
