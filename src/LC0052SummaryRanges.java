import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定一个无重复元素的有序整数数组 nums 。
//
//        返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
//
//        列表中的每个区间范围 [a,b] 应该按如下格式输出：
//
//        "a->b" ，如果 a != b
//        "a" ，如果 a == b
//        ?
//
//        示例 1：
//
//        输入：nums = [0,1,2,4,5,7]
//        输出：["0->2","4->5","7"]
//        解释：区间范围是：
//        [0,2] --> "0->2"
//        [4,5] --> "4->5"
//        [7,7] --> "7"


public class LC0052SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        int len = nums.length;
        if (len==0)
            return list;
        int count = 0;
        int i = 0;
        for (i = 0; i < len-1; i++) {
            if (Math.abs(nums[i+1]-nums[i])==1){
                count++;
            }
            if (Math.abs(nums[i+1]-nums[i])>1){
                if (count == 0){
                    list.add(nums[i]+"");
                }else {
                    list.add(nums[i-count]+"->"+nums[i]);
                }
                count = 0;
            }

        }
        if (count==0){
            list.add(nums[i] + "");
        }else {
            list.add(nums[i-count]+"->"+nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = summaryRanges(new int[]{-2147483648,-2147483647,2147483647});
        System.out.println(strings);
    }
}
