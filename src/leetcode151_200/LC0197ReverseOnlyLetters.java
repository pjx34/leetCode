package leetcode151_200;

import java.util.regex.Pattern;

//
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
//        示例 1：
//
//        输入："ab-cd"
//        输出："dc-ba"
//
public class LC0197ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int righ = chars.length-1;
       while (left<righ) {
            if (isLetter(chars[left])&&isLetter(chars[righ])){
                char tmp = chars[left];
                chars[left] = chars[righ];
                chars[righ] = tmp;
                left++;
                righ--;
            }
            if (!isLetter(chars[left])) left++;
            if (!isLetter(chars[righ])) righ--;
        }
        return new String(chars);
    }

    public static boolean isLetter(char ch){
       // return (int)ch>=65 && (int)ch<=90||(int)ch>=97 && (int)ch<=122;
        return Character.isLetter(ch);
    }

    public static void main(String[] args) {
        String s = "7_28]";
        String s1 = reverseOnlyLetters(s);
        System.out.println(s1);
        System.out.println((int)'Z');
    }
}
