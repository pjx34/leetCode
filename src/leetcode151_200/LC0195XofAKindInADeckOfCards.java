package leetcode151_200;

import java.util.HashMap;

//����һ���ƣ�ÿ�����϶�д��һ��������
//
//��ʱ������Ҫѡ��һ������ X��ʹ���ǿ��Խ������ư���������ֳ� 1 �������飺
//
//ÿ�鶼��?X?���ơ�
//�������е����϶�д����ͬ��������
//�������ѡ�� X >= 2 ʱ����?true��
//ʾ�� 1��
//���룺[1,2,3,4,4,3,2,1]
//�����true
//���ͣ����еķ����� [1,1]��[2,2]��[3,3]��[4,4]
public class LC0195XofAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int x = 0;
        for (Integer value : map.values()) {
            if (value>0){
                x = gcd(x,value);
                if (x==1)
                    return false;
            }
        }
        return x>=2;
    }

    // շת�����
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
