package leetcode151_200;
//��������ǵ��������򵥵��ݼ��ģ���ô���ǵ����ġ�
//����������� i <= j��A[i] <= A[j]����ô���� A �ǵ��������ġ� ����������� i <= j��A[i]> = A[j]����ô���� A �ǵ����ݼ��ġ�
//������������ A?�ǵ�������ʱ���� true�����򷵻� false��
//ʾ�� 1��
//
//���룺[1,2,2,3]
//�����true
public class LC0183MonotonicArray {

    //ͨ����βԪ��ȷ�������򵥼�
    public boolean isMonotonic1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[0]<=nums[len-1]){
                if (nums[i]>nums[i+1])
                    return false;
            }else{
                if (nums[i]<nums[i+1])
                    return false;
            }
        }
        return true;
    }

    //ͬʱ���������򷵻�false
    public boolean isMonotonic(int[] nums) {
        boolean isAsc = true;
        boolean isDesc = true;
        for (int i = 0; i+1 < nums.length; i++) {
            if (nums[i]>nums[i+1])
                isAsc = false;
            if (nums[i]<nums[i+1])
                isDesc = false;
        }
        return isAsc||isDesc;
    }


}
