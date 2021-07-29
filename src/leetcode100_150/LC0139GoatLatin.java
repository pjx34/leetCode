package leetcode100_150;
//给定一个由空格分割单词的句子?S。每个单词只包含大写或小写字母。
//我们要将句子转换为?“Goat Latin”（一种类似于 猪拉丁文?- Pig Latin 的虚构语言）。
//山羊拉丁文的规则如下：
//如果单词以元音开头（a, e, i, o, u），在单词后添加"ma"。
//例如，单词"apple"变为"applema"。
//如果单词以辅音字母开头（即非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
//例如，单词"goat"变为"oatgma"。
//根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从1开始。
//例如，在第一个单词后添加"a"，在第二个单词后添加"aa"，以此类推。
//返回将?S?转换为山羊拉丁文后的句子。
//示例 1:
//输入: "I speak Goat Latin"
//输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
public class LC0139GoatLatin {
    public static String toGoatLatin(String sentence) {
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (isStartWithAEIOU(strings[i]))
                sb.append(strings[i]+"ma");
            else if (!isStartWithAEIOU(strings[i])){
                sb.append(strings[i].substring(1)+strings[i].charAt(0)+"ma");
            }
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            sb.append(" ");

        }
        return sb.toString().trim();
    }

    public static boolean isStartWithAEIOU(String s){
        return s.startsWith("a")||s.startsWith("e")||s.startsWith("i")||s.startsWith("o")||s.startsWith("u")||
                s.startsWith("A")||s.startsWith("E")||s.startsWith("I")||s.startsWith("O")||s.startsWith("U");
    }

    public static void main(String[] args) {
        String a = "I speak Goat Latin";
        String s = toGoatLatin(a);
        System.out.println(s);
    }
}
