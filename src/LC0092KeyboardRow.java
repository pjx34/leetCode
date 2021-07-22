import java.util.ArrayList;
import java.util.HashSet;

//����һ���ַ������� words ��ֻ���ؿ���ʹ���� ��ʽ���� ͬһ�е���ĸ��ӡ�����ĵ��ʡ���������ͼ��ʾ��
//
//��ʽ���� �У�
//
//��һ�����ַ� "qwertyuiop" ��ɡ�
//�ڶ������ַ� "asdfghjkl" ��ɡ�
//���������ַ� "zxcvbnm" ��ɡ�
//
public class LC0092KeyboardRow {
    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        for (int i = 0; i < row1.length(); i++) {
            set1.add(row1.charAt(i));
        }
        for (int i = 0; i < row2.length(); i++) {
            set2.add(row2.charAt(i));
        }
        for (int i = 0; i < row3.length(); i++) {
            set3.add(row3.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            String word = words[i];//ÿһ������
            for (int j = 0; j < word.length(); j++) {
                if (set1.contains(word.charAt(j)))
                    flag1 = true;
                if (set2.contains(word.charAt(j)))
                    flag2 = true;
                if (set3.contains(word.charAt(j)))
                    flag3 = true;
            }
            if (flag1&&!flag2&&!flag3)
                list.add(word);
            if (!flag1&&flag2&&!flag3)
                list.add(word);
            if (!flag1&&!flag2&&flag3)
                list.add(word);
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strings = {"omk"};
        String[] res = findWords(strings);
        for (String item :res) {
            System.out.println(item);
        }
    }
}
