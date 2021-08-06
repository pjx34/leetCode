package leetcode151_200;

import java.util.Arrays;

//����һ���Ǹ��������� nums ���������һ���� x ��ʹ�� nums ��ǡ���� x ��Ԫ�� ���ڻ��ߵ��� x ����ô�ͳ� nums ��һ�� �������� ���� x �Ǹ������ ����ֵ ��
//ע�⣺ x ���� �� nums ���е�Ԫ�ء�
//������� nums ��һ�� �������� ���뷵����������ֵ x �����򣬷��� -1 ������֤�����ǣ���� nums ���������飬��ô������ֵ x �� Ψһ�� ��
//ʾ�� 1��
//
//���룺nums = [3,5]
//�����2
//���ͣ��� 2 ��Ԫ�أ�3 �� 5�����ڻ���� 2 ��
public class LC0187SpecialArrayWithXElementsGraterThanOrEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = nums[0]; i < nums[length-1] ; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (nums[j]>=i)
                    count++;
            }
            if (count==i)
                return i;
        }
        return -1;
    }
}
