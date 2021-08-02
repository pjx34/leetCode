package leetcode100_150;
//�����������Ե����� arr ��Ϊ ɽ������ ��
//arr.length >= 3
//���� i��0 < i?< arr.length - 1��ʹ�ã�
//arr[0] < arr[1] < ... arr[i-1] < arr[i]
//arr[i] > arr[i+1] > ... > arr[arr.length - 1]
//������������ɵ�ɽ������ arr �������κ����� arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] ���±� i ��
//ʾ�� 1��
//
//���룺arr = [0,1,0]
//�����1
public class LC0144PeakIndexInAMountainArray {
    //˳�����
    public int peakIndexInMountainArray1(int[] arr) {
        for (int i = 0; i+1 < arr.length; i++) {
            if (arr[i]>arr[i+1])
                return i;
        }
        return -1;
    }

    //���ַ�
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int res = 0;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]>arr[mid+1]){
                res = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
}
