package leetcode100_150;
//���� n ���������ҳ�ƽ��������ҳ���Ϊ k �����������飬����������ƽ������
//
//?
//
//ʾ����
//
//���룺[1,12,-5,-6,50,3], k = 4
//�����12.75
//���ͣ����ƽ���� (12-5-6+50)/4 = 51/4 = 12.75
public class LC0117MaximumAverageSubarryI {


    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = k; i < nums.length ; i++) {
            sum = sum + nums[i]-nums[i-k];
            max = Math.max(sum,max);
        }
        return max*1.0/k;
    }

    public static void main(String[] args) {
        int[] ints = {5};
        int k = 1;
        double maxAverage = findMaxAverage(ints, k);
        System.out.println(maxAverage);
    }
}
