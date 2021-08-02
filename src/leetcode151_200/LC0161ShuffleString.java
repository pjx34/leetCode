package leetcode151_200;
//����һ���ַ��� s ��һ�� ������ͬ ���������� indices ��
//�������������ַ��� s �����е� i ���ַ���Ҫ�ƶ��� indices[i] ָʾ��λ�á�
//�����������к���ַ�����

//���룺s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//�����"leetcode"
public class LC0161ShuffleString {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            char ch = s.charAt(indices[i]);
            sb.replace(indices[i],indices[i]+1,String.valueOf(s.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       // String s = "codeleet";
       // int[] indices = {4,5,6,7,0,2,1,3};
        String s = "abc";
        int[] indices1 = {0,1,2};
        String s1 = restoreString(s, indices1);
        System.out.println(s1);
    }
}
