package leetcode201_250;

import java.util.Arrays;

//
//���ι���·������ n ��վ��������� 0 �� n - 1 ���б�š�������֪ÿһ�����ڹ���վ֮��ľ��룬distance[i] ��ʾ���Ϊ i �ĳ�վ�ͱ��Ϊ (i + 1) % n �ĳ�վ֮��ľ��롣
//        �����ϵĹ����������԰�˳ʱ�����ʱ��ķ�����ʻ��
//        ���س˿ʹӳ����� start ��Ŀ�ĵ� destination ֮�����̾��롣
//        ʾ�� 1��
//        ���룺distance = [1,2,3,4], start = 0, destination = 1
//        �����1
//        ���ͣ�����վ 0 �� 1 ֮��ľ����� 1 �� 9����Сֵ�� 1��
public class LC0212DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int min = Math.min(start,destination);
        int max = Math.max(start,destination);
        int sum = 0;
        int sum1 = Arrays.stream(distance).sum();
        for (int i = min,j = max; i < max ; i++) {
            sum += distance[i];
        }
        return Math.min(sum,sum1-sum);
    }
}
