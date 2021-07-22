//�ڡ�Ӣ�����ˡ��������У���һ���� ����Ī�� ��Ӣ�ۣ����Ĺ��������õз�Ӣ�۰�ϣ������ע���������֣������ж�״̬�����ڣ�������Ī�԰�ϣ�Ĺ���ʱ�����к���Ī�������ж�����ʱ�䣬����Ҫ�����ϣ���ж�״̬��ʱ����
//
//�������Ϊ��Ī�ڸ�����ʱ�����й�����������ʹ��ϣ�����ж�״̬��
//ʾ��1:
//
//����: [1,4], 2
//���: 4
//ԭ��: �� 1 �������Ī��ʼ�԰�ϣ���й�����ʹ�������ж����ж�״̬��ά�� 2 ���ӣ�ֱ���� 2 ��ĩ������
//�� 4 �������Ī�ٴι�����ϣ��ʹ�ð�ϣ������� 2 ���ж�ʱ�䡣
//����������� 4 �롣
//ʾ��2:
//
//����: [1,2], 2
//���: 3
//ԭ��: �� 1 �������Ī��ʼ�԰�ϣ���й�����ʹ�������ж����ж�״̬��ά�� 2 ���ӣ�ֱ���� 2 ��ĩ������
//���ǵ� 2 �������Ī�ٴι������Ѿ������ж�״̬�İ�ϣ��
//�����ж�״̬���ɵ��ӣ���Ī�ڵ� 2 �������ι������ڵ� 3 ��ĩ������
//����������� 3 ��
public class LC0090TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i+1 < timeSeries.length; i++) {
            if (timeSeries[i+1]-timeSeries[i]>=duration)
                sum += duration;
            else
                sum += timeSeries[i+1] - timeSeries[i];
        }
        return sum + duration;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2};
        int poisonedDuration = findPoisonedDuration(ints, 2);
        System.out.println(poisonedDuration);
    }
}
