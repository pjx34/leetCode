package leetcode201_250;

////
//给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
//        对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
//        示例 1：
//
//        输入：text = "alice is a good girl she is a good student", first = "a", second = "good"
//        输出：["girl","student"]

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
