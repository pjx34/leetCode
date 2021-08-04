package leetcode151_200;
//����һ���ɴ�СдӢ����ĸ��ɵ��ַ��� s ��
//һ������õ��ַ����У����������ַ� s[i] �� s[i+1]������ 0<= i <= s.length-2 ��Ҫ������������:
//�� s[i] ��Сд�ַ����� s[i+1] ����������ͬ�Ĵ�д�ַ���
//�� s[i] �Ǵ�д�ַ����� s[i+1] ����������ͬ��Сд�ַ���
//���㽫�ַ�������ã�ÿ���㶼���Դ��ַ�����ѡ���������������� �������� �ַ���ɾ����ֱ���ַ��������Ϊֹ��
//�뷵������õ� �ַ��� ����Ŀ��֤�ڸ�����Լ�������£�����������Ӧ�Ĵ���Ψһ�ġ�
//ע�⣺���ַ���Ҳ��������õ��ַ�������������û���κ��ַ���
//ʾ�� 1��
//���룺s = "leEeetcode"
//�����"leetcode"
//���ͣ��������һ��ѡ���� i = 1 ���� i = 2������ʹ "leEeetcode" ����Ϊ "leetcode" ��
public class LC0168MakeTheStringGreat {
    public static String makeGood(String s) {
        StringBuffer ret = new StringBuffer();
        int retIndex = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ret.length() > 0 && Character.toLowerCase(ret.charAt(retIndex)) == Character.toLowerCase(ch) && ret.charAt(retIndex) != ch) {
                ret.deleteCharAt(retIndex);
                retIndex--;
            } else {
                ret.append(ch);
                retIndex++;
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
