package leetcode100_150;
//给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
//注意：如果对空文本输入退格字符，文本继续为空。
//示例 1：
//
//输入：S = "ab#c", T = "ad#c"
//输出：true
//解释：S 和 T 都会变成 “ac”。
public class LC0143BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        char[] charsS = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charsS.length; i++) {
            char ch = s.charAt(i);
            if (ch!='#'){
                sb.append(ch);
            }
            else{
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        char[] charsT = t.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < charsT.length; i++) {
            char ch = t.charAt(i);
            if (ch!='#'){
                sb1.append(ch);
            }
            else{
                if (sb1.length()>0){
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
        }
        System.out.println(sb1.toString());
        return sb.toString().equals(sb1.toString());
    }

    public static void main(String[] args) {
        String s = "ab#c";
        backspaceCompare(s,s);
    }
}
