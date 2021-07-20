import java.util.Arrays;

//��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������
//
//��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
//
//����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���
//
//?
//
//ʾ�� 1��
//
//���룺["h","e","l","l","o"]
//�����["o","l","l","e","h"]
//
public class LC0067ReverseString {
    public static void reverseString1(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            int tmp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = (char)tmp;
        }
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for (int left = 0, right = len-1 ; left < len/2; left++,right--) {
            int tmp = s[left];
            s[left] = s[right];
            s[right] = (char)tmp;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
