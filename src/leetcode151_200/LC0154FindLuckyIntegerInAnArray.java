package leetcode151_200;

import java.util.HashMap;
import java.util.Map;

//在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
//
//给你一个整数数组 arr，请你从中找出并返回一个幸运数。
//
//如果数组中存在多个幸运数，只需返回 最大 的那个。
//如果数组中不含幸运数，则返回 -1 。
public class LC0154FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue() && entry.getValue()>max){
                max = entry.getKey();
            }
        }
        return max;
    }
}
