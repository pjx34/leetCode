package leetcode100_150;
//����һ���������� nums ���������Ǵ��� Ψһ�� һ��������� ��
//
//�����ҳ������е����Ԫ�ز�������Ƿ� ������������ÿ���������ֵ����� ������ǣ��򷵻� ���Ԫ�ص��±� �����򷵻� -1 ��
public class LC0129LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        int max = 0;
        int sec_max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                sec_max = max;
                max = nums[i];
                index = i;
            }else if(nums[i]>sec_max){
                sec_max = nums[i];
            }
        }
        return max>=2*sec_max?index:-1;
    }



    public static void getTwo(int[] nums) {
        int max = 0;
        int sec_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                sec_max = max;
                max = nums[i];
            }else if (nums[i]>sec_max){
                sec_max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
    }

    public static void getThree(int[] nums){
        int max = 0;
        int sec_max = 0;
        int thrid_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                sec_max = max;
                max = nums[i];
            }else if (nums[i]>sec_max){
                thrid_max = sec_max;
                sec_max = nums[i];
            }else if (nums[i]>thrid_max){
                thrid_max = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(sec_max);
        System.out.println(thrid_max);
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,9,8};
        getThree(ints);
    }
}
