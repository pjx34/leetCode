package leetcode100_150;
//����һ���ַ���?s���������֣�'0' - '9'����?'#'?��ɡ�����ϣ������������?s?ӳ��ΪһЩСдӢ���ַ���
//
//�ַ���'a' - 'i'���ֱ��ã�'1' -?'9'����ʾ��
//�ַ���'j' - 'z'���ֱ��ã�'10#'?-?'26#'����ʾ��?
//����ӳ��֮���γɵ����ַ�����
//
//��Ŀ���ݱ�֤ӳ��ʼ��Ψһ��
public class LC0148DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i+2<len&&s.charAt(i+2)=='#'){
                int a = Integer.parseInt(s.charAt(i)+"")*10+Integer.parseInt(s.charAt(i+1)+"")+96;
                char ch = (char)(a);
                i = i+2;
                sb.append(ch);
            }else{
                int a = Integer.parseInt(s.charAt(i)+"")+96;
                char ch = (char)(a);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((char)97);
        System.out.println((int)'j');
        String s = "10#11#12";
        String s1 = freqAlphabets(s);
        System.out.println(s1);
    }
}
