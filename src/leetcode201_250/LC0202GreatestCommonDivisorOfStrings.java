package leetcode201_250;
//�����ַ���?S ��?T��ֻ���� S = T + ... + T��T �������� 1 �λ��Σ�ʱ�����ǲ��϶�?��T �ܳ��� S����
//
//������ַ���?X��Ҫ������?X �ܳ��� str1 ��?X �ܳ��� str2��
//
//?
//
//ʾ�� 1��
//
//���룺str1 = "ABCABC", str2 = "ABC"
//�����"ABC"
public class LC0202GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int count = 0;
        for (int i = 0; i < chars1.length&&i<chars2.length; i++) {
            if (chars1[i]==chars2[i])
                count++;
        }
        return str1.substring(0,count);
    }
}
