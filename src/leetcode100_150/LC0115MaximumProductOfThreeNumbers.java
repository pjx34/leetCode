package leetcode100_150;

import java.util.Arrays;

//����һ���������� nums �����������ҳ�����������ɵ����˻������������˻���
public class LC0115MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (nums[0]>0||(nums[0]<0&&nums[1]>0))
            return nums[len-1]*nums[len-2]*nums[len-3];
       // if (nums[0]<0&&nums[1]<0)
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3],nums[0]*nums[1]*nums[len-1]);
    }
}
