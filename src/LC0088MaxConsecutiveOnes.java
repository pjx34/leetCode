//给定一个二进制数组， 计算其中最大连续 1 的个数。
//
//?
//
//示例：
//
//输入：[1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
public class LC0088MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;//连续1的个数
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
