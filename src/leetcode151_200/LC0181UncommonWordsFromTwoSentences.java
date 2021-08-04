package leetcode151_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//给定两个句子?A?和?B?。?（句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
//如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
//返回所有不常用单词的列表。
//您可以按任何顺序返回列表。
//示例 1：
//
//输入：A = "this apple is sweet", B = "this apple is sour"
//输出：["sweet","sour"]
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
