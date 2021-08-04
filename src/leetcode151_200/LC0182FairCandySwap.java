package leetcode151_200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//����˿�ͱ����в�ͬ��С���ǹ�����A[i] �ǰ���˿ӵ�еĵ� i ���ǹ����Ĵ�С��B[j] �Ǳ���ӵ�еĵ� j ���ǹ����Ĵ�С��
//
//��Ϊ���������ѣ����������뽻��һ���ǹ������������������Ƕ�����ͬ���ǹ���������һ����ӵ�е��ǹ�����������ӵ�е��ǹ�����С���ܺ͡���
//
//����һ���������� ans������ ans[0] �ǰ���˿���뽻�����ǹ����Ĵ�С��ans[1]?�� Bob ���뽻�����ǹ����Ĵ�С��
//
//����ж���𰸣�����Է��������κ�һ������֤�𰸴��ڡ�
//ʾ�� 1��
//
//���룺A = [1,1], B = [2,2]
//�����[1,2]
public class LC0182FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> set = new HashSet<>();
        int sum1 = Arrays.stream(aliceSizes).sum();
        int sum2 = Arrays.stream(bobSizes).sum();
        int delta = (sum1-sum2)/2;
        for (int aliceSize : aliceSizes) {
            set.add(aliceSize);
        }
        for (int bobSize : bobSizes) {
            if (set.contains(bobSize+delta))
               return new int[]{bobSize+delta,bobSize};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] ints = {1,2,5};
        int[] ints1 = {2,4};
        int[] res = fairCandySwap(ints, ints1);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
