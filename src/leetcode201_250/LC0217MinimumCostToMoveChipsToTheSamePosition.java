package leetcode201_250;
//�����Ϸ�����һЩ���룬ÿ�������λ�ô�������?chips?���С�
//
//����Զ� �κγ��� ִ���������ֲ���֮һ�����޲���������0 ��Ҳ���ԣ���
//
//���� i ����������������ƶ� 2 ����λ������Ϊ 0��
//���� i ����������������ƶ� 1 ����λ������Ϊ 1��
//�ʼ��ʱ��ͬһλ����Ҳ���ܷ����������߸���ĳ��롣
//
//���ؽ����г����ƶ���ͬһλ�ã�����λ�ã�������Ҫ����С���ۡ�
//ʾ�� 1��
//
//���룺chips = [1,2,3]
//�����1
//���ͣ��ڶ��������ƶ���λ�����Ĵ����� 1����һ�������ƶ���λ�����Ĵ����� 0���ܴ���Ϊ 1��
public class LC0217MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i]%2==0)
                even++;
            else{
                odd++;
            }
        }
        return Math.min(odd,even);
    }
}
