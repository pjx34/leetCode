//����һ���ַ��� s ��һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰ k ���ַ����з�ת��
//
//        ���ʣ���ַ����� k ������ʣ���ַ�ȫ����ת��
//        ���ʣ���ַ�С�� 2k �����ڻ���� k ������תǰ k ���ַ��������ַ�����ԭ����
//
//
//        ʾ��:
//
//        ����: s = "abcdefg", k = 2
//        ���: "bacdfeg"
public class LC0100ReverseStringII {

    public static String reverseStr(String s, int k) {
        String reverse = "";
        for (int i = 0; i+k<=s.length(); i=i+k) {
            String item;
            if (i+k>=s.length()){
                 item = new StringBuffer(s.substring(i, i + 2)).reverse().toString();
            }else {
                 item = new StringBuffer(s.substring(i)).reverse().toString();
            }

            reverse += item;
        }
        return reverse;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String s1 = reverseStr(s, k);
        System.out.println(s1);
    }
}
