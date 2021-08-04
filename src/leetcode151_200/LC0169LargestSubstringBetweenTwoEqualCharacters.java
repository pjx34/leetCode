package leetcode151_200;
//给你一个字符串 s，请你返回 两个相同字符之间的最长子字符串的长度 ，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1 。
//
//子字符串 是字符串中的一个连续字符序列。
public class LC0169LargestSubstringBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int endIndex = s.lastIndexOf(s.charAt(i));
            if (endIndex-i>max)
                max = endIndex-i-1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
    }
}
