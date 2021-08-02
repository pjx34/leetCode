package leetcode151_200;
//����һ���������� nums ��
//���һ������ (i,j) ���� nums[i] == nums[j] �� i < j ���Ϳ�����Ϊ����һ�� ������ ��
//���غ����Ե���Ŀ��
//ʾ�� 1��
//���룺nums = [1,2,3,1,1,3]
//�����4
//���ͣ��� 4 ������ԣ��ֱ��� (0,3), (0,4), (3,4), (2,5) ���±�� 0 ��ʼ
public class LC0158NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == a)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3};
        int i = numIdenticalPairs(ints);
        System.out.println(i);
    }
}
