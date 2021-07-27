package leetcode100_150;

//集合 s 包含从 1 到?n?的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
//
//给定一个数组 nums 代表了集合 S 发生错误后的结果。
//
//请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
//
//?
//
//示例 1：
//
//输入：nums = [1,2,2,4]
//输出：[2,3]
//示例 2：
//
//输入：nums = [1,1]
//输出：[1,2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LC0119SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(nums[i]);
        }
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (i+1<nums.length&&nums[i]==nums[i+1]&&flag){
                res[0] = nums[i];  //重复的数字
                flag = !flag;
            }
            if (i+1!=0&&!list.contains(i+1)){
                res[1] = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,5,3,2,2,7,6,4,8,9};
        int[] errorNums = findErrorNums(ints);
        for (int errorNum : errorNums) {
            System.out.println(errorNum);
        }
    }
}
