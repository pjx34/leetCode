package leetcode151_200;
//「无零整数」是十进制表示中 不含任何 0?的正整数。
//给你一个整数?n，请你返回一个 由两个整数组成的列表 [A, B]，满足：
//A 和 B?都是无零整数
//A + B = n
//题目数据保证至少有一个有效的解决方案。
//如果存在多个有效解决方案，你可以返回其中任意一个。
//示例 1：
//
//输入：n = 2
//输出：[1,1]
//解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
public class LC0152ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        int left = 0;
        int right = n;
        while (true){
            left++;
            right--;
            boolean b1 = !String.valueOf(left).contains("0");
            boolean b2 = !String.valueOf(right).contains("0");
            if (b1&&b2)
                break;
        }
        return new int[]{left,right};
    }

    public static void main(String[] args) {
        int[] ints = getNoZeroIntegers(11);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
