package leetcode100_150;
//����һ��?n?��Ԫ������ģ�������������?nums ��һ��Ŀ��ֵ?target ?��дһ����������?nums?�е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
//
//
//ʾ�� 1:
//
//����: nums = [-1,0,3,5,9,12], target = 9
//���: 4
//����: 9 ������ nums �в����±�Ϊ 4
public class LC0124BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]>target)
                right = mid-1;
            if (nums[mid]<target)
                left = mid+1;
        }
        return -1;
    }
}
