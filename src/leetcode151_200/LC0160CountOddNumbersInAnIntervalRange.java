package leetcode151_200;
//���������Ǹ�����?low ��?high?�����㷵��?low ��?high?֮�䣨�������ߣ���������Ŀ��
//ʾ�� 1��
//
//���룺low = 3, high = 7
//�����3
//���ͣ�3 �� 7 ֮����������Ϊ [3,5,7] ��
public class LC0160CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {
        int count =0;
        if (low%2==0&&high%2==0)
            count = (high-low)/2;
        else
            count = (high-low)/2+1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
    }
}
