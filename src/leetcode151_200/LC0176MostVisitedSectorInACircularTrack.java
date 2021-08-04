package leetcode151_200;

import java.util.ArrayList;
import java.util.List;
//����һ������ n ��һ���������� rounds ����һ��Բ�������� n ��������ɣ�������Ŵ� 1 �� n ���ֽ������������Ͼٰ�һ�������ɱ�������������ȫ���� m ���׶���ɡ����У��� i ���׶ν�������� rounds[i - 1] ��ʼ�������� rounds[i] ������������˵���� 1 �׶δ�?rounds[0]?��ʼ����?rounds[1]?������
//������������ʽ���ؾ������������Ǽ������������������ ���� ���С�
//ע�⣬�������������������ʱ���γ�һ��Բ����μ���һ��ʾ������
//ʾ�� 1��
//���룺n = 4, rounds = [1,3,1,2]
//�����[1,2]
//���ͣ����������ɱ��������� 1 ��ʼ���������������Ĵ���������ʾ��
//1 --> 2 --> 3���׶� 1 ������--> 4 --> 1���׶� 2 ������--> 2���׶� 3 �����������������ɽ�����
//���У����� 1 �� 2 �����������Σ������Ǿ������������������������� 3 �� 4 ��ֻ������һ�Ρ�
public class LC0176MostVisitedSectorInACircularTrack {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        if (start<=end){
            for (int i = start; i <=end ; i++) {
                list.add(i);
            }
        }else {
            for (int i = 1; i <= end ; i++) {
                list.add(i);
            }
            for (int i = start; i <= n ; i++) {
                list.add(i);
            }
        }
        return list;
    }
}
