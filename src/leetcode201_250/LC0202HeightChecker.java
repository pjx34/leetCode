package leetcode201_250;

import java.util.Arrays;

//ѧУ����Ϊȫ��ѧ����һ����ȼ����ա�����Ҫ��ѧ����Ҫ���� �ǵݼ� �ĸ߶�˳���ų�һ�С�
//�����ĸ߶�������������� expected ��ʾ������ expected[i] ��Ԥ��������һ���е� i λ��ѧ���ĸ߶ȣ��±�� 0 ��ʼ������һ���������� heights ����ʾ ��ǰѧ��վλ �ĸ߶������heights[i] ����һ���е� i λѧ���ĸ߶ȣ��±�� 0 ��ʼ����
//�������� heights[i] != expected[i] �� �±����� ��
//ʾ����
//
//���룺heights =?[1,1,4,2,1,3]
//�����3
//���ͣ�
//�߶ȣ�[1,1,4,2,1,3]
//Ԥ�ڣ�[1,1,1,2,3,4]
//�±� 2 ��4 ��5 ����ѧ���߶Ȳ�ƥ�䡣
public class LC0202HeightChecker {
    public int heightChecker(int[] heights) {
        int[] clone = heights.clone();
        Arrays.sort(clone);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (clone[i]!=heights[i])
                count++;
        }
        return count;
    }
}
