package leetcode151_200;
//给你一个整数?n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，并将结果以字符串格式返回。
//示例 1：
//输入：n = 987
//输出："987"
public class LC0171ThousandSeparator {
    public static String thousandSeparator(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if (s.length()<=3)
            return s;
        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        do {
            sb.insert(len-3*count,'.');
            count++;
        }while (len-3*count>0);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = thousandSeparator(987);
        System.out.println(s);
    }
}
