package leetcode151_200;
//����һ���ַ��� s�����㷵�� ������ͬ�ַ�֮�������ַ����ĳ��� �����㳤��ʱ�����������ַ���������������������ַ��������� -1 ��
//
//���ַ��� ���ַ����е�һ�������ַ����С�
public class LC0169LargestSubstringBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int endIndex = s.lastIndexOf(s.charAt(i));
            if (endIndex-i>max)
                max = endIndex-i-1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
    }
}
