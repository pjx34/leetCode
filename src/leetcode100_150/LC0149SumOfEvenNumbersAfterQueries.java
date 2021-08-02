package leetcode100_150;

import java.util.Arrays;

//����һ����������?A?��һ����ѯ����?queries��
//
//���ڵ�?i?�β�ѯ����?val =?queries[i][0], index?= queries[i][1]�����ǻ��?val?�ӵ�?A[index]?�ϡ�Ȼ�󣬵�?i?�β�ѯ�Ĵ��� A ��ż��ֵ�ĺ͡�
//���˴�������?index = queries[i][1]?�Ǵ� 0 ��ʼ��������ÿ�β�ѯ���������޸�����?A����
//�������в�ѯ�Ĵ𰸡���Ĵ�Ӧ��������?answer?������answer[i]?Ϊ��?i?�β�ѯ�Ĵ𰸡�
//ʾ����
//
//���룺A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//�����[8,6,2,4]
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

    //��ȡ�����е�ż����
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
