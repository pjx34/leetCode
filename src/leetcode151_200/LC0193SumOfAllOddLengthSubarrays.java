package leetcode151_200;
//����һ������������?arr?������������п��ܵ���������������ĺ͡�
//
//������ ����Ϊԭ�����е�һ�����������С�
//���㷵�� arr?�� ������������������ĺ� ��
//ʾ�� 1��
//
//���룺arr = [1,4,2,5,3]
//�����58
//���ͣ�����������������������ǵĺ�Ϊ��
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
public class LC0193SumOfAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int j = 0; j <= length ; j++) {
            //j =1,3,5 ���
            if (j%2==0)
                continue;
            for (int i = 0; i < length ; i++) {
                int start = i;
                int end = i+j;
                if (end>length)
                    break;
                for (int k = start; k < end ; k++) {
                        sum += arr[k];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {10,11,12};
        int i = sumOddLengthSubarrays(ints);
        System.out.println(i);
    }
}
