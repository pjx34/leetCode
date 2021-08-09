package leetcode151_200;

import java.util.HashMap;

//����һ������С�����߳��������� n ��С�򣬱�Ŵ� lowLimit ��ʼ���� highLimit ���������� lowLimit ��?highLimit ����?n == highLimit - lowLimit + 1�����������������ĺ��ӣ���Ŵ� 1 �� infinity ��
//
//��Ĺ����ǽ�ÿ��С���������У����к��ӵı��Ӧ������С������ÿλ���ֵĺ͡����磬��� 321 ��С��Ӧ�������� 3 + 2 + 1 = 6 �ĺ��ӣ������ 10 ��С��Ӧ�������� 1 + 0 = 1 �ĺ��ӡ�
//
//������������ lowLimit �� highLimit �����ط������С��ĺ����е�С������������ж�����Ӷ�����������С��ֻ�践��������һ���ӵ�С��������
//ʾ�� 1��
//
//���룺lowLimit = 1, highLimit = 10
//�����2
//���ͣ�
//���ӱ�ţ�1 2 3 4 5 6 7 8 9 10 11 ...
//С��������2 1 1 1 1 1 1 1 1 0  0  ...
//��� 1 �ĺ��ӷ������С��С������Ϊ 2 ��
public class LC0191MaximumNumberOfBallsInABox {
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = lowLimit; i <= highLimit ; i++) {
            int sum = 0;
            sum = getSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            if (map.get(sum)>max)
                max = map.get(sum);
        }
        return max;
    }

    private static int getSum(int i) {
        int sum = 0;
        while (i!=0){
            int digital = i%10;
            sum += digital;
            i /= 10;
        }
         return sum;
    }


    public static void main(String[] args) {
        int i = countBalls(1, 10);
        System.out.println(i);
        System.out.println(getSum(123));
    }
}
