//����һ�����������飬 ��������������� 1 �ĸ�����
//
//?
//
//ʾ����
//
//���룺[1,1,0,1,1,1]
//�����3
//���ͣ���ͷ����λ��������λ�������� 1 ������������� 1 �ĸ����� 3.
public class LC0088MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;//����1�ĸ���
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count=0;
            }else {
                count ++;
                max = Math.max(count,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {1,1,0,1,1,1,1,0,1,1,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(ints);
        System.out.println(maxConsecutiveOnes);
    }
}
