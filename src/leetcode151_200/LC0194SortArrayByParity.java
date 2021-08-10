package leetcode151_200;
//����һ���Ǹ��������� A������һ�����飬�ڸ������У�?A ������ż��Ԫ��֮�������������Ԫ�ء�
//
//����Է���������������κ�������Ϊ�𰸡�
//ʾ����
//
//���룺[3,1,2,4]
//�����[2,4,3,1]
//��� [4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
public class LC0194SortArrayByParity {

    //����˫ָ��
    public int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        int righ = nums.length-1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                res[left] = nums[i];
                left++;
            }else {
                res[righ] = nums[i];
                righ--;
            }
        }
        return res;
    }

    //��������
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, righ = nums.length-1;
        while (left<righ){
            if (nums[left]%2>nums[righ]%2){
                int tmp = nums[left];
                nums[left] = nums[righ];
                nums[righ] = tmp;
            }
            if (nums[left]%2==0)
                left++;
            if (nums[righ]%2==1)
                righ--;
        }
        return nums;
    }
}
