package leetcode151_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//������������?A?��?B?��?��������һ���ɿո�ָ��ĵ��ʡ�ÿ�����ʽ���Сд��ĸ��ɡ���
//���һ������������һ��������ֻ����һ�Σ�����һ��������ȴû�г��֣���ô������ʾ��ǲ������ġ�
//�������в����õ��ʵ��б�
//�����԰��κ�˳�򷵻��б�
//ʾ�� 1��
//
//���룺A = "this apple is sweet", B = "this apple is sour"
//�����["sweet","sour"]
public class LC0181UncommonWordsFromTwoSentences {
    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");
        for (String s : split1) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (String s : split2) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
       String s1 =  "apple apple";
       String s2 =  "banana";
        String[] strings = uncommonFromSentences(s1, s2);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
