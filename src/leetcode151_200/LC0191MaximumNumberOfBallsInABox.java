package leetcode151_200;

import java.util.HashMap;

//你在一家生产小球的玩具厂工作，有 n 个小球，编号从 lowLimit 开始，到 highLimit 结束（包括 lowLimit 和?highLimit ，即?n == highLimit - lowLimit + 1）。另有无限数量的盒子，编号从 1 到 infinity 。
//
//你的工作是将每个小球放入盒子中，其中盒子的编号应当等于小球编号上每位数字的和。例如，编号 321 的小球应当放入编号 3 + 2 + 1 = 6 的盒子，而编号 10 的小球应当放入编号 1 + 0 = 1 的盒子。
//
//给你两个整数 lowLimit 和 highLimit ，返回放有最多小球的盒子中的小球数量。如果有多个盒子都满足放有最多小球，只需返回其中任一盒子的小球数量。
//示例 1：
//
//输入：lowLimit = 1, highLimit = 10
//输出：2
//解释：
//盒子编号：1 2 3 4 5 6 7 8 9 10 11 ...
//小球数量：2 1 1 1 1 1 1 1 1 0  0  ...
//编号 1 的盒子放有最多小球，小球数量为 2 。
public class LC0191MaximumNumberOfBallsInABox {
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = lowLimit; i <= highLimit ; i++) {
            int sum = 0;
            sum = getSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            if (map.get(sum)>max)
                max = map.get(sum);
        }
        return max;
    }

    private static int getSum(int i) {
        int sum = 0;
        while (i!=0){
            int digital = i%10;
            sum += digital;
            i /= 10;
        }
         return sum;
    }


    public static void main(String[] args) {
        int i = countBalls(1, 10);
        System.out.println(i);
        System.out.println(getSum(123));
    }
}
