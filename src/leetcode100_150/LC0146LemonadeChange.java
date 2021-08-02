package leetcode100_150;
//������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ?5?��Ԫ��
//�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����
//ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��
//ע�⣬һ��ʼ����ͷû���κ���Ǯ��
//������ܸ�ÿλ�˿���ȷ���㣬����?true?�����򷵻� false?��
//ʾ�� 1��
//���룺[5,5,5,10,20]
//�����true
public class LC0146LemonadeChange {

    //̰���㷨
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill==5)
                five++;
            else if (bill==10){
                if (five==0){
                    return false;
                }
                ten++;
                five--;
            }
            else if (bill==20){
                if (ten>0&&five>0){
                    ten--;
                    five--;
                }else if(ten==0&&five>=3){
                    five = five-3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
