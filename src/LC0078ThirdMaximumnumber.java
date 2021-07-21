import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
public class LC0078ThirdMaximumnumber {
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length-1; i >=0 ;i--) {
            if(set.add(nums[i]))
                count++;
            if (count==3)
                return nums[i];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        System.out.println(thirdMax(ints));;
    }

}
