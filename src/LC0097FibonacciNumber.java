//斐波那契数，通常用?F(n) 表示，形成的序列称为 斐波那契数列 。该数列由?0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
//
//F(0) = 0，F(1)?= 1
//F(n) = F(n - 1) + F(n - 2)，其中 n > 1
//给你 n ，请计算 F(n) 。
public class LC0097FibonacciNumber {

    //递归
    public int fib1(int n) {
        if (n<2)
            return n;
        return fib1(n-1)+fib1(n-2);
    }

    //动态规划 只要记录前两个状态,所以可以优化成常数空间
    public int fib(int n){
        if (n<2)
            return n;
        int a = 0, b = 1, c;
        while (n-->1) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
