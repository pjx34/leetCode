package leetcode100_150;
//给定两个字符串, A?和?B。
//A?的旋转操作就是将?A 最左边的字符移动到最右边。?例如, 若?A = 'abcde'，在移动一次之后结果就是'bcdea'?。如果在若干次旋转操作之后，A?能变成B，那么返回True。
//示例 1:
//输入: A = 'abcde', B = 'cdeab'
//输出: true
public class LC0133RotateString {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1)+s.charAt(0);
            if (s.equals(goal))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
       String goal =  "cdeab";
        boolean b = rotateString(s, goal);
        System.out.println(b);
    }
}
