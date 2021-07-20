import java.util.HashMap;
import java.util.HashSet;

//����һ������� (ransom) �ַ�����һ����־(magazine)�ַ������жϵ�һ���ַ��� ransom �ܲ����ɵڶ����ַ��� magazines ������ַ����ɡ�������Թ��ɣ����� true �����򷵻� false��
//
//(��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼����־�ַ����е�ÿ���ַ�ֻ����������ַ�����ʹ��һ�Ρ�)
//
//?
//
//ʾ�� 1��
//
//���룺ransomNote = "a", magazine = "b"
//�����false
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
