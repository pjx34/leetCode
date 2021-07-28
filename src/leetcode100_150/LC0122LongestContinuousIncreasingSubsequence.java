package leetcode100_150;
//����һ��δ��������������飬�ҵ���� ���������������У������ظ����еĳ��ȡ�
//
//���������������� �����������±� l �� r��l < r��ȷ�����������ÿ�� l <= i < r������ nums[i] < nums[i + 1] ����ô������ [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] �����������������С�
//ʾ�� 1��
//
//���룺nums = [1,3,5,4,7]
//�����3
public class LC0122LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int res = 1;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[i]<nums[i+1])
                res = Math.max(res,++count);//++count�Լ��ȼ�1,Ȼ���ٽ�����һ������
            else
                count = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,5,4,2,3,4,5};
        int lengthOfLCIS = findLengthOfLCIS(ints);
        System.out.println(lengthOfLCIS);
    }
}
