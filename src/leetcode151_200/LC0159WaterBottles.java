package leetcode151_200;
//С�����������ڴ������� numExchange ���վ�ƿ���Զһ�һƿ�¾ơ��㹺���� numBottles ƿ�ơ�
//����ȵ��˾�ƿ�еľƣ���ô��ƿ�ͻ��ɿյġ�
//������� ��� �ܺȵ�����ƿ�ơ�
public class LC0159WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            ++ans;
            ++bottle;
        }
        return ans;
    }
}
