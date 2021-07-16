//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。说明：本题中，我们将空字符串定义为有效的回文串。
public class LC0029ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥× ]", "");
        String reverse = "";
        for (int i = s1.length()-1; i >=s1.length()/2-1; i--) {
            reverse += s1.charAt(i);
        }
        return s1.toLowerCase().contains(reverse.toLowerCase());
    }

    public static void main(String[] args) {
        String str = "race a car";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
}
