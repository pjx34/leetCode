package leetcode100_150;
//����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��
//
//?
//
//ʾ����
//
//���룺"Let's take LeetCode contest"
//�����"s'teL ekat edoCteeL tsetnoc"
//?
//
//��ʾ��
//
//���ַ����У�ÿ�������ɵ����ո�ָ��������ַ����в������κζ���Ŀո�
//ͨ������135,719
public class LC0103ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        String res = "";
        for (String string : strings) {
            String item = new StringBuffer(string).reverse().toString();
            res = res + item+" ";
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);

    }

    //"s'teL ekat edoCteeL tsetnoc"
   // "s'teL ekat edoCteeL tsetnoc "

}
