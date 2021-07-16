//����һ������ prices �����ĵ�?i ��Ԫ��?prices[i] ��ʾһ֧������Ʊ�� i ��ļ۸���ֻ��ѡ�� ĳһ�� ������ֻ��Ʊ����ѡ���� δ����ĳһ����ͬ������ �����ù�Ʊ�����һ���㷨�����������ܻ�ȡ���������
//��������Դ���ʽ����л�ȡ�������������㲻�ܻ�ȡ�κ����󣬷��� 0 ��
//
//ʾ�� 1��
//
//���룺[7,1,5,3,6,4]
//�����5
//���ͣ��ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
//ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�ͬʱ���㲻��������ǰ������Ʊ��

public class LC0027BeatTimeToBuyAndSellStock {

    //����
    public static int maxProfit1(int[] prices) {
        int max = -1;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length-1-i; j++) {
                if(prices[j] - prices[i]>max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    //
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }else if (prices[i]-min>max)
                max = prices[i] - min;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {2,5,1,3,8};
        int maxProfit = maxProfit(ints);

        System.out.println(maxProfit);
    }




}
