//给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。

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
