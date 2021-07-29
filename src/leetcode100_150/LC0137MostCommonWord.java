package leetcode100_150;

import java.util.HashMap;
import java.util.Map;

//给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
//题目保证至少有一个词不在禁用列表中，而且答案唯一。
//禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。
public class LC0137MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");
        String[] split = s.trim().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (!"".equals(split[i].trim())&&!map.containsKey(split[i].trim())){
                map.put(split[i].trim(),1);
            }else if(!"".equals(split[i].trim())&&map.containsKey(split[i].trim())){
                map.put(split[i].trim(),map.get(split[i].trim())+1);
            }
        }
        for (int i = 0; i < banned.length; i++) {
            if (map.containsKey(banned[i]))
                map.remove(banned[i]);
        }
        int max = 0;
        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry!=null&&entry.getValue()>=max){
                res = entry.getKey();
                max = entry.getValue();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String paragraph ="Bob. hIt, baLl";
        String[] banned = {  "bob", "hit"};
        String s = mostCommonWord(paragraph, banned);
        System.out.println(s);
    }
}
