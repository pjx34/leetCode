import java.util.Arrays;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
public class LC0063MoveZeroes {

    //双重for循环,类似冒泡排序
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

    //双指针,非零的元素往前挪
    public static void moveZeroes(int[] nums) {
        int p1 = 0;  //p1找0元素的下标
        int p2 = 0;  //p2找非0元素的下标
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
