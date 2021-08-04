package leetcode151_200;
//����һ���ɲ�ͬ�ַ���ɵ��ַ���?allowed?��һ���ַ�������?words?�����һ���ַ�����ÿһ���ַ����� allowed?�У��ͳ�����ַ����� һ���ַ��� ��
//���㷵��?words?������?һ���ַ��� ����Ŀ��
//ʾ�� 1��
//���룺allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//�����2
//���ͣ��ַ��� "aaab" �� "baa" ����һ���ַ�������Ϊ����ֻ�����ַ� 'a' �� 'b' ��
//��Դ�����ۣ�LeetCode��
//���ӣ�https://leetcode-cn.com/problems/count-the-number-of-consistent-strings
//����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
public class LC0166CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                if (!allowed.contains(String.valueOf(s.charAt(j)))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String all = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        System.out.println(countConsistentStrings(all,words));
    }
}
