package leetcode151_200;

import java.util.Arrays;

//����һ���������� arr��ֻ�п��Խ��仮��Ϊ��������ȵ� �ǿ� ����ʱ�ŷ���?true�����򷵻� false��
//
//��ʽ�ϣ���������ҳ�����?i + 1 < j?������?(arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])?�Ϳ��Խ��������ȷ֡�
public class LC0199PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        if (sum%3!=0)
            return false;
        int partSum = 0;
        int index1 = 0;
        for (int i = 0; i < arr.length ; i++) {
            index1 = i;
            partSum += arr[i];
            if (partSum==sum/3){
                index1 = i;
                break;
            }
        }
        if (index1==arr.length-1)
            return false;

        int partSum1 = 0;
        int index2 = index1+1;
        for (int i = index2; i < arr.length ; i++) {
            index2 = i;
            partSum1 += arr[index2];
            if (partSum1==sum/3){
                index2 = i;
                break;
            }
        }

        if (index2==arr.length-1)
            return false;
        return true;
    }
}
