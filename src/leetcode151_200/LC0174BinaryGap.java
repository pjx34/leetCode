package leetcode151_200;
//����һ�������� n���ҵ������� n �Ķ����Ʊ�ʾ������ ���� 1 ֮��� ����� ������������������ڵ� 1������ 0 ��
//
//���ֻ�� 0 ������ 1 �ָ��������ܲ����� 0 ��������Ϊ������ 1 �˴� ���� ������ 1 ֮��ľ��������ǵĶ����Ʊ�ʾ��λ�õľ��Բ���磬"1001" �е����� 1 �ľ���Ϊ 3 ��
public class LC0174BinaryGap {
    public static int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int count = 0;
        boolean isCount = false;//�Ƿ�ʼ����
        while (n!=0) {
            int remainder = n%2;
                sb.append(remainder);
            n /= 2;
            if (isCount)
                count++;
            if (remainder==1&&!isCount){
                count=0;
                isCount = true;
            }
            else if (remainder==1&&isCount){
                max = Math.max(count,max);
                count=0;
            }
        }
        System.out.println(sb.reverse().toString());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(4));
    }
}
