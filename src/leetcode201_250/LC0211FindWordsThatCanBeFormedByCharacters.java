package leetcode201_250;

import java.util.HashMap;
import java.util.Map;

//����һ�ݡ��ʻ�����ַ������飩?words?��һ�š���ĸ�����ַ�����?chars��
//�����������?chars?�еġ���ĸ�����ַ���ƴд�� words?�е�ĳ�������ʡ����ַ���������ô���Ǿ���Ϊ��������������ʡ�
//ע�⣺ÿ��ƴд��ָƴд�ʻ���е�һ�����ʣ�ʱ��chars �е�ÿ����ĸ��ֻ����һ�Ρ�
//���شʻ��?words?�������յ����е��ʵ� ����֮�͡�
//ʾ�� 1��
//
//���룺words = ["cat","bt","hat","tree"], chars = "atach"
//�����6
//���ͣ�
//�����γ��ַ��� "cat" �� "hat"�����Դ��� 3 + 3 = 6��
public class LC0211FindWordsThatCanBeFormedByCharacters {
    public static int countCharacters(String[] words, String chars) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            char[] chs = words[i].toCharArray(); //cat,bt,hat,tree
            boolean flag = true;
            for (int j = 0; j < chs.length; j++) {
                String tmp = chars;
                char ch = chs[j];//c,a,t
                if (tmp.indexOf(ch)==-1){
                    flag = false;
                    break;
                }else{
                    tmp = tmp.replaceFirst(String.valueOf(ch),"");
                }
            }
            if (flag)
                sum += chs.length;
        }
        return sum;
    }

    public int countCharacters1(String[] words, String chars) {
        Map<Character, Integer> charsCnt = new HashMap<Character, Integer>();
        int length = chars.length();
        for (int i = 0; i < length; ++i) {
            char c = chars.charAt(i);
            charsCnt.put(c, charsCnt.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        for (String word : words) {
            Map<Character, Integer> wordCnt = new HashMap<Character, Integer>();
            int wordLength = word.length();
            for (int i = 0; i < wordLength; ++i) {
                char c = word.charAt(i);
                wordCnt.put(c, wordCnt.getOrDefault(c, 0) + 1);
            }
            boolean isAns = true;
            for (int i = 0; i < wordLength; ++i) {
                char c = word.charAt(i);
                if (charsCnt.getOrDefault(c, 0) < wordCnt.getOrDefault(c, 0)) {
                    isAns = false;
                    break;
                }
            }
            if (isAns) {
                ans += word.length();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        int i = countCharacters(words, chars);
        System.out.println(i);
    }
}
