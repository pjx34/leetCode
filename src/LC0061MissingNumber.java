//����һ������ [0, n] �� n ���������� nums ���ҳ� [0, n] �����Χ��û�г����������е��Ǹ�����

import java.util.Arrays;

public class LC0061MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++) {
            if (nums[i]!=i)
                return i;
        }
        return nums.length;
    }
}
