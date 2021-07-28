package leetcode100_150;
//给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母?target，请你寻找在这一有序列表里比目标字母大的最小字母。
//在比较时，字母是依序循环出现的。举个例子：
//如果目标字母 target = 'z' 并且字符列表为?letters = ['a', 'b']，则答案返回?'a'
//示例：
//输入:
//letters = ["c", "f", "j"]
//target = "a"
//输出: "c"
public class LC0128FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];
    }
}
