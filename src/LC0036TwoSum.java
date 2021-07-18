import java.util.Arrays;
import java.util.HashMap;

//给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
public class LC0036TwoSum {

    //自己的方法
    public static int[] twoSum1(int[] numbers, int target) {
        HashMap map = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i]))
                return new int[]{(int) map.get(numbers[i])+1,i+1};
            int delta = target - numbers[i];
            map.put(delta,i);
        }
        return null;
    }

    //双指针
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r){
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l+1,r+1};
            }else if (sum < target)
                l++;
            else
                r--;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,4};
        int target = 6;
        int[] ints = twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
        System.out.println(-1/2);
    }
}
