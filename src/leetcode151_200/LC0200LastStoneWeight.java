package leetcode151_200;

import java.util.Arrays;

//��һ��ʯͷ��ÿ��ʯͷ������������������
//
//ÿһ�غϣ�����ѡ������ ���ص� ʯͷ��Ȼ������һ����顣����ʯͷ�������ֱ�Ϊ?x ��?y����?x <= y����ô����Ŀ��ܽ�����£�
//
//���?x == y����ô����ʯͷ���ᱻ��ȫ���飻
//���?x != y����ô����Ϊ?x?��ʯͷ������ȫ���飬������Ϊ?y?��ʯͷ������Ϊ?y-x��
//������ֻ��ʣ��һ��ʯͷ�����ش�ʯͷ�����������û��ʯͷʣ�£��ͷ��� 0��
//���룺[2,7,4,1,8,1]
//�����1
public class LC0200LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for (int i = 0; i < stones.length - 1; i++){     //���Ƚ�length-1��
            Arrays.sort(stones);
            if (stones[index - 1] == 0) break;           //˵�����ֻʣһ��ʯͷ
            stones[index] -= stones[index - 1];          //���ֲ�ͬ���ʹ��ͬһ���ʽ����
            stones[index - 1] = 0;                       //ÿ�αȽϺ�϶�����һ��ʯͷ��destroyed
        }
        return stones[index];
    }
}
