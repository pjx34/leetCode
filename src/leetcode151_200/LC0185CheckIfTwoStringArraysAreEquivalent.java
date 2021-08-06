package leetcode151_200;
//输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
//输出：true
//word1 表示的字符串为 "ab" + "c" -> "abc"
//word2 表示的字符串为 "a" + "bc" -> "abc"
//两个字符串相同，返回 true
public class LC0185CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len1 = word1[0].length();
        int len2 = word2[0].length();
        int min = Math.min(len1,len2);
        String s1 = word1[0].substring(0,min);
        String s2 = word2[0].substring(0,min);
        if (!s1.equals(s2))
            return false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        if (!sb1.toString().equals(sb2.toString())){
            return false;
        }
        return true;
    }
}
