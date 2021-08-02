package leetcode100_150;

import java.util.ArrayList;

//����������Сд��ĸ���ɵ��ַ���?A?��?B?��ֻҪ���ǿ���ͨ������ A �е�������ĸ�õ��� B ��ȵĽ�����ͷ���?true?�����򷵻� false ��
//
//������ĸ�Ķ�����ȡ�����±� i �� j ���±�� 0 ��ʼ����ֻҪ i!=j �ͽ��� A[i] �� A[j] �����ַ������磬�� "abcd" �н����±� 0 ���±� 2 ��Ԫ�ؿ������� "cbad" ��
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

    //�ж��ַ������Ƿ����ظ����ַ�
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
