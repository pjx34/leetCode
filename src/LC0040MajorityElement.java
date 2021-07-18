//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
//        你可以假设数组是非空的，并且给定的数组总是存在多数元素。


import java.util.Arrays;
import java.util.HashMap;

public class LC0040MajorityElement {

    //遍历
    public static int majorityElement1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])!=null){
                if (map.get(nums[i])+1>nums.length/2.0)
                    return nums[i];
                else
                    map.put(nums[i],map.get(nums[i])+1);
            }else
                map.put(nums[i],1);
        }
        return 0;
    }

    //排序后遍历
    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                count++;
                if (count>nums.length/2.0)
                    return nums[i];
            }else{
                count = 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {6,6,6,7,7};
        int i = majorityElement(ints);
        System.out.println(i);
    }
}
