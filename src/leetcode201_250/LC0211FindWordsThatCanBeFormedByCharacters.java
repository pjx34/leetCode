package leetcode201_250;

import java.util.HashMap;
import java.util.Map;

//给你一份『词汇表』（字符串数组）?words?和一张『字母表』（字符串）?chars。
//假如你可以用?chars?中的『字母』（字符）拼写出 words?中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
//注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
//返回词汇表?words?中你掌握的所有单词的 长度之和。
//示例 1：
//
//输入：words = ["cat","bt","hat","tree"], chars = "atach"
//输出：6
//解释：
//可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
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
