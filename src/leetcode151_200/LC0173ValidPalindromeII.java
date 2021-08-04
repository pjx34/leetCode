package leetcode151_200;
//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
//示例 1:
//输入: s = "aba"
//输出: true
public class LC0173ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
        return true;
    }

    public static boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdefdfedcGba";
        boolean b = validPalindrome(s);
        System.out.println(b);
    }

}
