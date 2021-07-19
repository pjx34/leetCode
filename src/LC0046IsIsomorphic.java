//���������ַ���?s?��?t���ж������Ƿ���ͬ���ġ�
//
//        ���?s?�е��ַ����԰�ĳ��ӳ���ϵ�滻�õ�?t?����ô�������ַ�����ͬ���ġ�
//
//        ÿ�����ֵ��ַ���Ӧ��ӳ�䵽��һ���ַ���ͬʱ���ı��ַ���˳�򡣲�ͬ�ַ�����ӳ�䵽ͬһ���ַ��ϣ���ͬ�ַ�ֻ��ӳ�䵽ͬһ���ַ��ϣ��ַ�����ӳ�䵽�Լ�����
//
//        ?
//
//        ʾ�� 1:
//
//        ���룺s = "egg", t = "add"
//        �����true

import java.util.HashMap;

public class LC0046IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            if(!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i),s.charAt(i));
            }
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            if (map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("title", "paper");
        System.out.println(isomorphic);
    }
}
