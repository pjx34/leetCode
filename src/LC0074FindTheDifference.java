import java.util.Arrays;

//���������ַ��� s �� t������ֻ����Сд��ĸ��
//
//�ַ���?t?���ַ���?s?������ţ�Ȼ�������λ�����һ����ĸ��
//
//���ҳ��� t �б���ӵ���ĸ��
//
//?
//
//ʾ�� 1��
//
//���룺s = "abcd", t = "abcde"
//�����"e"
//���ͣ�'e' ���Ǹ�����ӵ���ĸ��
//
public class LC0074FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < s.length(); i++) {
            if (sChars[i]!=tChars[i])
                return tChars[i];
        }
        return tChars[s.length()];
    }
}
