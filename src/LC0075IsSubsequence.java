//�����ַ��� s �� t ���ж� s �Ƿ�Ϊ t �������С�
//
//�ַ�����һ����������ԭʼ�ַ���ɾ��һЩ��Ҳ���Բ�ɾ�����ַ������ı�ʣ���ַ����λ���γɵ����ַ����������磬"ace"��"abcde"��һ�������У���"aec"���ǣ���
//
//���ף�
//
//����д�������� S������ S1, S2, ... , Sk ���� k >= 10�ڣ�����Ҫ���μ�������Ƿ�Ϊ T �������С�����������£���������ı���룿
//
//ʾ�� 1��
//
//���룺s = "abc", t = "ahbgdc"
//�����true
public class LC0075IsSubsequence {

     public static boolean isSubsequence(String s, String t) {
        if (t.length()<s.length())
            return false;
        if (s.length()==0)
            return true;
        int p1 = 0;
        int p2 = 0;
        while (p1<s.length()&&p2<t.length()){
            if (s.charAt(p1) == t.charAt(p2)){
                p1++;
            }
            p2++;
        }
        return p1 == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }

}
