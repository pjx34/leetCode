package leetcode151_200;
//����һ���ַ���?sequence?������ַ��� word?�����ظ�?k?���γɵ��ַ�����?sequence?��һ�����ַ�������ô����?word �� �ظ�ֵΪ k ������ word?�� ����ظ�ֵ?�ǵ���?word?��?sequence?�������ظ�ֵ�����?word?����?sequence?���Ӵ�����ô�ظ�ֵ?k?Ϊ 0 ��
//����һ���ַ��� sequence?�� word?�����㷵�� ����ظ�ֵ?k ��
//ʾ�� 1��
//���룺sequence = "ababc", word = "ab"
//�����2
//���ͣ�"abab" �� "ababc" �����ַ�����
public class LC0186MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String tmp=word;
        while(sequence.contains(word)){
            word+=tmp;
            count++;
        }
        return count;
    }
}
