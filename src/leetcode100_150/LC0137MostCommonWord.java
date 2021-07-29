package leetcode100_150;

import java.util.HashMap;
import java.util.Map;

//����һ������ (paragraph) ��һ�����õ����б� (banned)�����س��ִ�����࣬ͬʱ���ڽ����б��еĵ��ʡ�
//��Ŀ��֤������һ���ʲ��ڽ����б��У����Ҵ�Ψһ��
//�����б��еĵ�����Сд��ĸ��ʾ�����������š������еĵ��ʲ����ִ�Сд���𰸶���Сд��ĸ��
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
