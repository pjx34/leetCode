package leetcode151_200;
//给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
//请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
//返回重新排列后的字符串。

//输入：s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//输出："leetcode"
public class LC0161ShuffleString {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            char ch = s.charAt(indices[i]);
            sb.replace(indices[i],indices[i]+1,String.valueOf(s.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       // String s = "codeleet";
       // int[] indices = {4,5,6,7,0,2,1,3};
        String s = "abc";
        int[] indices1 = {0,1,2};
        String s1 = restoreString(s, indices1);
        System.out.println(s1);
    }
}
