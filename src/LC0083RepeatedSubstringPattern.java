import sun.plugin2.jvm.RemoteJVMLauncher;

import java.util.Arrays;

//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
//
//示例 1:
//
//输入: "abab"
//
//输出: True
//
//解释: 可由子字符串 "ab" 重复两次构成。
//示例 2:
//
//输入: "aba"
//
//输出: False
//示例 3:
//
//输入: "abcabcabcabc"
//
//输出: True
//
//解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
public class LC0083RepeatedSubstringPattern {

    //爆破
    public static boolean repeatedSubstringPattern1(String s) {
        boolean flag = false;
        for (int i = 1; i < s.length(); i++) {
            String sub = s.substring(0,i);  // a,ab,abc
            for (int j = i; j + i <= s.length(); j+=i) {
                if (flag)
                    break;
                String sub_ = s.substring(j,j+i);
                if (!sub_.equals(sub)){
                    flag = false;
                    break;
                }
                if (j+i==s.length()){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    //kmp
    public boolean repeatedSubstringPattern2(String s) {
        return kmp(s + s, s);
    }

    public boolean kmp(String query, String pattern) {
        int n = query.length();
        int m = pattern.length();
        int[] fail = new int[m];
        Arrays.fill(fail, -1);
        for (int i = 1; i < m; ++i) {
            int j = fail[i - 1];
            while (j != -1 && pattern.charAt(j + 1) != pattern.charAt(i)) {
                j = fail[j];
            }
            if (pattern.charAt(j + 1) == pattern.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        int match = -1;
        for (int i = 1; i < n - 1; ++i) {
            while (match != -1 && pattern.charAt(match + 1) != query.charAt(i)) {
                match = fail[match];
            }
            if (pattern.charAt(match + 1) == query.charAt(i)) {
                ++match;
                if (match == m - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    //字符串匹配
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }



    public static void main(String[] args) {
        String s = "abcabcabc";
       // System.out.println(repeatedSubstringPattern(s));
    }
}
