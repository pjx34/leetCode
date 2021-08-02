package leetcode100_150;
//���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
//ע�⣺����Կ��ı������˸��ַ����ı�����Ϊ�ա�
//ʾ�� 1��
//
//���룺S = "ab#c", T = "ad#c"
//�����true
//���ͣ�S �� T ������ ��ac����
public class LC0143BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        char[] charsS = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charsS.length; i++) {
            char ch = s.charAt(i);
            if (ch!='#'){
                sb.append(ch);
            }
            else{
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        char[] charsT = t.toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < charsT.length; i++) {
            char ch = t.charAt(i);
            if (ch!='#'){
                sb1.append(ch);
            }
            else{
                if (sb1.length()>0){
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
        }
        System.out.println(sb1.toString());
        return sb.toString().equals(sb1.toString());
    }

    public static void main(String[] args) {
        String s = "ab#c";
        backspaceCompare(s,s);
    }
}
