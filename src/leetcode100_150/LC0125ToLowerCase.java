package leetcode100_150;

public class LC0125ToLowerCase {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            chars[i] |= 32;
        }
        return new String(chars);
    }
}
