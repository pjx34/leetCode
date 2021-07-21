import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode第一题,两数相加
public class LC0001TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = twoSum(nums, 9);
        System.out.println(Arrays.toString(res));
    }



    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if(!map.containsKey(a)){
                map.put(a, i);
            }
            if (map.containsKey(nums[i])) {
                res[0] = (int) map.get(nums[i]);
                res[1] = i;
            }
        }
        return res;
    }

}

