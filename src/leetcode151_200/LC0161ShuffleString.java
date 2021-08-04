package leetcode151_200;
//����һ���ַ��� s ��һ�� ������ͬ ���������� indices ��
//�������������ַ��� s �����е� i ���ַ���Ҫ�ƶ��� indices[i] ָʾ��λ�á�
//�����������к���ַ�����

//���룺s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//�����"leetcode"
public class LC0161ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
           chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}
