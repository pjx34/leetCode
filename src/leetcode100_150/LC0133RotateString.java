package leetcode100_150;
//���������ַ���, A?��?B��
//A?����ת�������ǽ�?A ����ߵ��ַ��ƶ������ұߡ�?����, ��?A = 'abcde'�����ƶ�һ��֮��������'bcdea'?����������ɴ���ת����֮��A?�ܱ��B����ô����True��
//ʾ�� 1:
//����: A = 'abcde', B = 'cdeab'
//���: true
public class LC0133RotateString {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1)+s.charAt(0);
            if (s.equals(goal))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
       String goal =  "cdeab";
        boolean b = rotateString(s, goal);
        System.out.println(b);
    }
}
