package leetcode100_150;
//?�����ַ���J?����ʯͷ�б�ʯ�����ͣ����ַ���?S������ӵ�е�ʯͷ��?S?��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
//J?�е���ĸ���ظ���J?��?S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
//ʾ�� 1:
//
//����: J = "aA", S = "aAAbbbb"
//���: 3
public class LC0131JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i))!=-1)
                sum++;
        }
        return sum;
    }
}
