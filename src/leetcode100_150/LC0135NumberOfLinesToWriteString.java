package leetcode100_150;

import java.util.HashMap;

//我们要把给定的字符串 S?从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，那么我们应该把这个字母写到下一行。我们给定了一个数组?widths?，这个数组?widths[0] 代表 'a' 需要的单位，?widths[1] 代表 'b' 需要的单位，...，?widths[25] 代表 'z' 需要的单位。
//现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。
//示例 1:
//输入:
//widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
//S = "abcdefghijklmnopqrstuvwxyz"
//输出: [3, 60]
public class LC0135NumberOfLinesToWriteString {
    public static int[] numberOfLines(int[] widths, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char a = 'a';
        for (int i = 0; i < widths.length; i++) {
            map.put(a++,widths[i]);
        }
        int b = 0;
        int sum = 0;
        int line = 1;
        for (int i = 0; i < s.length() ; i++) {

            if (sum+map.get(s.charAt(i))>100){
                line++;
                sum = map.get(s.charAt(i));
            }else{
                sum += map.get(s.charAt(i));
            }
        }
        return new int[]{line,sum};
    }

    public static void main(String[] args) {
       int[] ints = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
       String s = "abcdefghijklmnopqrstuvwxyz";
        int[] ints1 = numberOfLines(ints, s);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }
    }
}
