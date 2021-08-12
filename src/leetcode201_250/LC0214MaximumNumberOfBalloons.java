package leetcode201_250;

import java.util.ArrayList;

//����һ���ַ���?text������Ҫʹ�� text �е���ĸ��ƴ�վ����ܶ�ĵ���?"balloon"�����򣩡�
//
//�ַ���?text �е�ÿ����ĸ���ֻ�ܱ�ʹ��һ�Ρ����㷵��������ƴ�ճ����ٸ�����?"balloon"��
//ʾ�� 1��
//���룺text = "nlaebolko"
//�����1
public class LC0214MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons1(String text) {
        String s = "balloon";
        char[] chars = s.toCharArray();
        int index = 0;
        int count = 0;
        while (true){
            index = index%s.length();
            char ch = s.charAt(index);
            if (text.indexOf(ch)==-1){
                break;
            }else {
                text = text.replaceFirst(String.valueOf(ch),"");
            }
            index++;
            count++;
        }
        return count/s.length();
    }

    public static int maxNumberOfBalloons2(String text) {
        String s = "balloon";
        StringBuilder sb = new StringBuilder(text);
        char[] chars = s.toCharArray();
        int index = 0;
        int count = 0;
        int idx = 0;
        while (true){
            index = index%s.length();
            char ch = s.charAt(index);
            if ((idx = sb.indexOf(String.valueOf(ch)))==-1){
                break;
            }else {
                sb = sb.deleteCharAt(idx);
            }
            index++;
            count++;
        }
        return count/s.length();
    }

    public static int maxNumberOfBalloons(String text) {
        String s = "balloon";
        int[] arr = new int[122];
        int max = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            idx = (int)ch;
            if (s.indexOf(ch)!=-1){
                arr[idx] = arr[idx]+1;
            }
        }
       list.add(arr[98]);
        list.add(arr[97]);
        list.add(arr[108]/2);
        list.add(arr[111]);
        list.add(arr[110]);
        for (Integer integer : list) {
            max = Math.min(integer,max);
        }
        return max;
    }


    public static void main(String[] args) {
        String text = "balloonballoon";
        System.out.println(maxNumberOfBalloons(text));
        System.out.println((int)'b');
        System.out.println((int)'a');
        System.out.println((int)'l');
        System.out.println((int)'o');
        System.out.println((int)'n');
    }
}
