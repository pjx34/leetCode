package leetcode100_150;

import java.util.ArrayList;

//给定两个由小写字母构成的字符串?A?和?B?，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回?true?；否则返回 false 。
//
//交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
public class LC0145BuddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length())
            return false;
        if (s.equals(goal)&&isChongFu(s))
            return true;
        if (s.length()<2)
            return false;
        int[] index = new int[2];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count==2)
                break;
            if (s.charAt(i)!=goal.charAt(i)){
                index[count] = i;
                count++;
            }
        }
        if (count!=2)
            return false;
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(index[0],index[0]+1,s.charAt(index[1])+"");
        stringBuilder.replace(index[1],index[1]+1,s.charAt(index[0])+"");
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString().equals(goal);
    }

    //判断字符串中是否有重复的字符
    public static boolean isChongFu(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i),i+1)!=-1){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String a = "aa";
        String b = "aa";

        System.out.println(isChongFu("bc,aa"));
    }

}
