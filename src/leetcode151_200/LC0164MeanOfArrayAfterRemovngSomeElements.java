package leetcode151_200;

import java.util.Arrays;

//����һ���������� arr ������ɾ����С 5% �����ֺ���� 5% �����ֺ�ʣ�����ֵ�ƽ��ֵ��
// �� ��׼�� ����� 10-5 �Ľ��������Ϊ��ȷ�����
public class LC0164MeanOfArrayAfterRemovngSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length/20; i <arr.length-arr.length/20 ; i++) {
            sum += arr[i];
        }
        return sum/(0.9*arr.length);
    }
}
