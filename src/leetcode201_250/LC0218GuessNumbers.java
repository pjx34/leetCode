package leetcode201_250;
//СA �� СB ��������֡�СB ÿ�δ� 1, 2, 3 �����ѡ��һ����СA ÿ��Ҳ�� 1, 2, 3 ��ѡ��һ���¡�����һ���������������Ϸ���뷵�� СA �¶��˼��Σ�
//
//�����guess����Ϊ СA ÿ�εĲ²⣬answer����Ϊ СB ÿ�ε�ѡ��guess��answer�ĳ��ȶ�����3��
//
//?
//
//ʾ�� 1��
//
//���룺guess = [1,2,3], answer = [1,2,3]
//�����3
//���ͣ�СA ÿ�ζ��¶��ˡ�
public class LC0218GuessNumbers {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i]==answer[i])
                count++;
        }
        return count;
    }
}
