package leetcode100_150;
//����һ����������?nums ������������ �����±� ��
//���� �����±� �������һ���±꣬���������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�
//��������±�λ����������ˣ���ô�����֮����Ϊ 0 ����Ϊ���±����಻����Ԫ�ء���һ����������±�λ���������Ҷ�ͬ�����á�
//��������ж�������±꣬Ӧ�÷��� ������ ����һ����������鲻���������±꣬���� -1 ��

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

//ʾ�� 1��
//
//���룺nums = [1, 7, 3, 6, 5, 6]
//�����3
//���ͣ�
//�����±��� 3 ��
//�����֮�� sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ��
//�Ҳ���֮�� sum = nums[4] + nums[5] = 5 + 6 = 11 ��������ȡ�
public class LC0126FindPivotIndex {

    //���������������ߵĺ�
    public static int pivotIndex1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += nums[j];
            }
            for (int j = i+1; j < nums.length ; j++) {
                sum2 += nums[j];
            }
            if (sum1==sum2)
                return i;
        }
        return -1;
    }

    //2*��ߵĺ�+��ֵ=�ܺ�
    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum+nums[i]==total)
                return i;
            sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1,7,3,6,5,6};
        int index = pivotIndex(ints);
        System.out.println(index);
    }
}
