package leetcode201_250;

////
//������һ���� first �͵ڶ����� second��������ĳЩ�ı� text �п����� "first second third" ��ʽ���ֵ���������� second ���� first ���֣�third ���� second ���֡�
//        ����ÿ����������������������� "third" ��ӵ����У������ش𰸡�
//        ʾ�� 1��
//
//        ���룺text = "alice is a good girl she is a good student", first = "a", second = "good"
//        �����["girl","student"]

import java.util.ArrayList;

public class LC0203OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i+2 < strings.length; i++) {
            if (strings[i].equals(first)&&strings[i+1].equals(second)){
                list.add(strings[i+2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
