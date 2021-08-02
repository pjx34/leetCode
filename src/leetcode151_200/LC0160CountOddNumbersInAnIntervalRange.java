package leetcode151_200;
//给你两个非负整数?low 和?high?。请你返回?low 和?high?之间（包括二者）奇数的数目。
//示例 1：
//
//输入：low = 3, high = 7
//输出：3
//解释：3 到 7 之间奇数数字为 [3,5,7] 。
public class LC0160CountOddNumbersInAnIntervalRange {
    public static int countOdds(int low, int high) {
        int count =0;
        if (low%2==0&&high%2==0)
            count = (high-low)/2;
        else
            count = (high-low)/2+1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
    }
}
