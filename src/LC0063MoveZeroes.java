import java.util.Arrays;

//����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
public class LC0063MoveZeroes {

    //˫��forѭ��,����ð������
    public void moveZeroes1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] == 0){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }

    //˫ָ��,�����Ԫ����ǰŲ
    public static void moveZeroes(int[] nums) {
        int p1 = 0;  //p1��0Ԫ�ص��±�
        int p2 = 0;  //p2�ҷ�0Ԫ�ص��±�
        int len = nums.length;
        while (p2<len){
            if (nums[p2]!=0){
                int tmp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tmp;
                p1++;
            }
            p2++;
        }
    }

    public static int feibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return feibo(n-1)+feibo(n-2);
    }


    public static void main(String[] args) {
        System.out.println(feibo(9));
    }
}
