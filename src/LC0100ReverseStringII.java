//给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
//
//        如果剩余字符少于 k 个，则将剩余字符全部反转。
//        如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
//
//
//        示例:
//
//        输入: s = "abcdefg", k = 2
//        输出: "bacdfeg"
public class LC0100ReverseStringII {

    public static String reverseStr(String s, int k) {
        String reverse = "";
        for (int i = 0; i+k<=s.length(); i=i+k) {
            String item;
            if (i+k>=s.length()){
                 item = new StringBuffer(s.substring(i, i + 2)).reverse().toString();
            }else {
                 item = new StringBuffer(s.substring(i)).reverse().toString();
            }

            reverse += item;
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String s1 = reverseStr(s, k);
        System.out.println(s1);
    }
}
