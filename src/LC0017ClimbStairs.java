import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

// 爬楼梯
// 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？注意：给定 n 是一个正整数。
public class LC0017ClimbStairs {
    static Map<Integer,Integer> map = new HashMap<>();

    //递归
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    //递归时使用map解决超时的问题
    public static int climbStairs_map(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int num = 0;
        if(map.get(n)!=null)
            return (int)map.get(n);
        else{
            num = climbStairs(n-1) + climbStairs(n-2);
            map.put(n,num);
        }
        return num;
    }

    //动态规划
    public static int climbStairs_dp(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        long start3 = System.currentTimeMillis();
        int k = climbStairs_map(45);
        long end3 = System.currentTimeMillis();
        System.out.println("递归加map用时:"+(end3 - start3));

        long start2 = System.currentTimeMillis();
        int j = climbStairs(45);
        long end2 = System.currentTimeMillis();
        System.out.println("递归用时:"+(end2 - start2));

        long start1 = System.currentTimeMillis();
        int i = climbStairs_dp(45);
        long end1 = System.currentTimeMillis();
        System.out.println("dp用时:"+(end1 - start1));
    }
}
