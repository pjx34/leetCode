package leetcode151_200;
//给你一个正整数数组?arr?，请你计算所有可能的奇数长度子数组的和。
//
//子数组 定义为原数组中的一个连续子序列。
//请你返回 arr?中 所有奇数长度子数组的和 。
//示例 1：
//
//输入：arr = [1,4,2,5,3]
//输出：58
//解释：所有奇数长度子数组和它们的和为：
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
public class LC0193SumOfAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int j = 0; j <= length ; j++) {
            //j =1,3,5 间隔
            if (j%2==0)
                continue;
            for (int i = 0; i < length ; i++) {
                int start = i;
                int end = i+j;
                if (end>length)
                    break;
                for (int k = start; k < end ; k++) {
                        sum += arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {10,11,12};
        int i = sumOddLengthSubarrays(ints);
        System.out.println(i);
    }
}
