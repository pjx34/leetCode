package leetcode151_200;

import java.util.Arrays;

//������һЩ�����������ȣ���ɵ����� A����������������������ɵġ������Ϊ��������ε�����ܳ���
//��������γ��κ������Ϊ��������Σ�����?0��
//ʾ�� 1��
//���룺[2,1,2]
//�����5
public class LC0167LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=2; i--) {
            if (nums[i]<nums[i-1]+nums[i-2])
                return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}
