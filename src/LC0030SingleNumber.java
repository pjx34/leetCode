
//����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
//����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����

public class LC0030SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int item:nums){
            single = single^item;
        }
        return single;
    }
}
