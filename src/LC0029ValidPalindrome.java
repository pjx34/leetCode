//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
public class LC0029ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[\\pP+~$`^=|<>�����ޣ������������� ]", "");
        String reverse = "";
        for (int i = s1.length()-1; i >=s1.length()/2-1; i--) {
            reverse += s1.charAt(i);
        }
        return s1.toLowerCase().contains(reverse.toLowerCase());
    }

    public static void main(String[] args) {
        String str = "race a car";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
}
