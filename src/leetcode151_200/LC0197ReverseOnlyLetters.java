package leetcode151_200;

import java.util.regex.Pattern;

//
//����һ���ַ��� S������ ����ת��ġ� �ַ��������в�����ĸ���ַ���������ԭ�أ���������ĸ��λ�÷�����ת��
//        ʾ�� 1��
//
//        ���룺"ab-cd"
//        �����"dc-ba"
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
