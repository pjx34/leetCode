//����һ���ַ��� s�������ɵ�����ɣ�����֮���ÿո�����������ַ��������һ�����ʵĳ��ȡ�������������һ�����ʣ��뷵�� 0?��
// ���� ��ָ������ĸ��ɡ��������κοո��ַ���������ַ�����
////
public class LeetCode0013 {

    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' ')
                len++;
            else if (len!=0)
                return len;
        }
        return len;
    }
}
