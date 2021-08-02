package leetcode100_150;
//给你一个字符串?s，它由数字（'0' - '9'）和?'#'?组成。我们希望按下述规则将?s?映射为一些小写英文字符：
//
//字符（'a' - 'i'）分别用（'1' -?'9'）表示。
//字符（'j' - 'z'）分别用（'10#'?-?'26#'）表示。?
//返回映射之后形成的新字符串。
//
//题目数据保证映射始终唯一。
public class LC0148DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i+2<len&&s.charAt(i+2)=='#'){
                int a = Integer.parseInt(s.charAt(i)+"")*10+Integer.parseInt(s.charAt(i+1)+"")+96;
                char ch = (char)(a);
                i = i+2;
                sb.append(ch);
            }else{
                int a = Integer.parseInt(s.charAt(i)+"")+96;
                char ch = (char)(a);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((char)97);
        System.out.println((int)'j');
        String s = "10#11#12";
        String s1 = freqAlphabets(s);
        System.out.println(s1);
    }
}
