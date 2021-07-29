package leetcode100_150;

import java.util.HashMap;

//����Ҫ�Ѹ������ַ��� S?������д��ÿһ���ϣ�ÿһ�е������Ϊ100����λ�����������дĳ����ĸ��ʱ���ʹ���г�����100 ����λ����ô����Ӧ�ð������ĸд����һ�С����Ǹ�����һ������?widths?���������?widths[0] ���� 'a' ��Ҫ�ĵ�λ��?widths[1] ���� 'b' ��Ҫ�ĵ�λ��...��?widths[25] ���� 'z' ��Ҫ�ĵ�λ��
//���ڻش��������⣺���ٶ������ܷ���S���Լ����һ��ʹ�õĿ���Ƕ��ٸ���λ������Ĵ���Ϊ����Ϊ2�������б��ء�
//ʾ�� 1:
//����:
//widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
//S = "abcdefghijklmnopqrstuvwxyz"
//���: [3, 60]
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
