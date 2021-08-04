package leetcode151_200;
//����һ���������� arr ���Լ� a��b ��c ��������������ͳ�����к���Ԫ���������
//
//�����Ԫ�� (arr[i], arr[j], arr[k]) ��������ȫ������������Ϊ����һ�� ����Ԫ�� ��
//
//0 <= i < j < k <?arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//���� |x| ��ʾ x �ľ���ֵ��
//
//���� ����Ԫ������� ��
public class LC0162CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int _a = Math.abs(arr[i]-arr[j]);
                    int _b = Math.abs(arr[j]-arr[k]);
                    int _c = Math.abs(arr[i]-arr[k]);
                    if (_a<=a&&_b<=b&&_c<=c)
                        count++;
                }
            }
        }
        return count;
    }
}
