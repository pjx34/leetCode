package leetcode151_200;
//����һ������?n������ÿ����λ��ӵ㣨�� "." ���ţ���Ϊǧλ�ָ���������������ַ�����ʽ���ء�
//ʾ�� 1��
//���룺n = 987
//�����"987"
public class LC0171ThousandSeparator {
    public static String thousandSeparator(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if (s.length()<=3)
            return s;
        StringBuilder sb = new StringBuilder(s);
        int count = 1;
        do {
            sb.insert(len-3*count,'.');
            count++;
        }while (len-3*count>0);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = thousandSeparator(987);
        System.out.println(s);
    }
}
