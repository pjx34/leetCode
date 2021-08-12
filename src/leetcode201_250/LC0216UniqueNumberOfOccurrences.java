package leetcode201_250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//给你一个整数数组?arr，请你帮忙统计数组中每个数的出现次数。
//
//如果每个数的出现次数都是独一无二的，就返回?true；否则返回 false。
//示例 1：
//输入：arr = [1,2,2,1,1,3]
//输出：true
//解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
public class LC0216UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Integer value : map.values()) {
            if (!set.add(value))
                return false;
        }
        return true;
    }
}
