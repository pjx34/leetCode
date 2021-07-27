package leetcode100_150;

import java.util.Arrays;

//��������Ϊ?2n?���������� nums ����������ǽ���Щ���ֳ�?n ��, ���� (a1, b1), (a2, b2), ..., (an, bn) ��ʹ�ô� 1 ��?n �� min(ai, bi) �ܺ����
//
//���ظ� ����ܺ� ��
public class LC0105ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {6,2,6,5,1,2};
        int i = arrayPairSum(ints);
        System.out.println(i);
    }
}
