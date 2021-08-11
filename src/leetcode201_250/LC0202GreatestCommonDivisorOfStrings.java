package leetcode201_250;
//对于字符串?S 和?T，只有在 S = T + ... + T（T 自身连接 1 次或多次）时，我们才认定?“T 能除尽 S”。
//
//返回最长字符串?X，要求满足?X 能除尽 str1 且?X 能除尽 str2。
//
//?
//
//示例 1：
//
//输入：str1 = "ABCABC", str2 = "ABC"
//输出："ABC"
public class LC0202GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length&&i<chars2.length; i++) {
            if (chars1[i]==chars2[i])
                count++;
        }
        return str1.substring(0,count);
    }
}
