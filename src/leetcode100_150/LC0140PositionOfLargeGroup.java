package leetcode100_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
//例如，在字符串 s = "abbxxxxzyy"?中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
//分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
//我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
//找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
//示例?1：
//
//输入：s = "abbxxxxzzy"
//输出：[[3,6]]
//解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
public class LC0140PositionOfLargeGroup {
    public static List<List<Integer>> largeGroupPositions1(String s) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i+=count) {
            char ch = s.charAt(i);//a,b,c,d,d,d,e,e,e,e,a,a,b,b,b,c,d
            count = 0;
            StringBuilder sb = new StringBuilder();
            while (i+count<=s.length()&&s.substring(i,i+count).indexOf(sb.toString())!=-1){
                sb.append(ch);
                count++;
            }
            if (count>3){
                count--;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(i+count-1);
                lists.add(list);
            }else{
                count = 1;
            }
        }
        return lists;
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length();
        int num = 1;
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i+1>=len||s.charAt(i)!=s.charAt(i+1)){
                if (num>=3){
                    lists.add(Arrays.asList(i-num+1,i));
                }
               num = 1;
            }else{
                num++;
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        String s = "aaaabbb";
        List<List<Integer>> lists = largeGroupPositions(s);
        System.out.println(lists);
    }
}
