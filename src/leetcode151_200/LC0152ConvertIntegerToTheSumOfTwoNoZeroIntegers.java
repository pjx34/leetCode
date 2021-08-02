package leetcode151_200;
//��������������ʮ���Ʊ�ʾ�� �����κ� 0?����������
//����һ������?n�����㷵��һ�� ������������ɵ��б� [A, B]�����㣺
//A �� B?������������
//A + B = n
//��Ŀ���ݱ�֤������һ����Ч�Ľ��������
//������ڶ����Ч�������������Է�����������һ����
//ʾ�� 1��
//
//���룺n = 2
//�����[1,1]
//���ͣ�A = 1, B = 1. A + B = n ���� A �� B ��ʮ���Ʊ�ʾ��ʽ���������κ� 0 ��
public class LC0152ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        int left = 0;
        int right = n;
        while (true){
            left++;
            right--;
            boolean b1 = !String.valueOf(left).contains("0");
            boolean b2 = !String.valueOf(right).contains("0");
            if (b1&&b2)
                break;
        }
        return new int[]{left,right};
    }

    public static void main(String[] args) {
        int[] ints = getNoZeroIntegers(11);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
