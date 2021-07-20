import java.util.HashMap;
import java.util.HashSet;

//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
//
//(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
//
//?
//
//示例 1：
//
//输入：ransomNote = "a", magazine = "b"
//输出：false
//
public class LC0072RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!map1.containsKey(magazine.charAt(i))){
                map1.put(magazine.charAt(i),1);
            }else{
                map1.put(magazine.charAt(i),map1.get(magazine.charAt(i))+1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!map2.containsKey(ransomNote.charAt(i))){
                map2.put(ransomNote.charAt(i),1);
            }else {
                map2.put(ransomNote.charAt(i),map2.get(ransomNote.charAt(i))+1);
            }
        }
        for (Character item : map2.keySet()){
            if (!map1.containsKey(item)){
                return false;
            }
            else {
                if (map2.get(item)>map1.get(item))
                    return false;
            }
        }
        return true;
    }
}
