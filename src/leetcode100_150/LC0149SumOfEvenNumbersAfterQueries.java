package leetcode100_150;

import java.util.Arrays;

//给出一个整数数组?A?和一个查询数组?queries。
//
//对于第?i?次查询，有?val =?queries[i][0], index?= queries[i][1]，我们会把?val?加到?A[index]?上。然后，第?i?次查询的答案是 A 中偶数值的和。
//（此处给定的?index = queries[i][1]?是从 0 开始的索引，每次查询都会永久修改数组?A。）
//返回所有查询的答案。你的答案应当以数组?answer?给出，answer[i]?为第?i?次查询的答案。
//示例：
//
//输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//输出：[8,6,2,4]
public class LC0149SumOfEvenNumbersAfterQueries {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = getSumOfEven(nums);
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if (nums[index]%2==0){
                sum = sum-nums[index];
            }
            nums[index] += val;
            if (nums[index]%2==0){
                sum += nums[index];
            }
            res[i] = sum;
        }
        return res;
    }

    //获取数组中的偶数和
    public static int getSumOfEven(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)
                sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] ints = sumEvenAfterQueries(A, queries);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
