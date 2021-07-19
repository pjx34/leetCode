//编写一个算法来判断一个数 n 是不是快乐数。
//
//        「快乐数」定义为：
//
//        对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
//        然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//        如果 可以变为? 1，那么这个数就是快乐数。


import java.util.HashSet;

public class LC0043HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1) {
            if (!set.add(n)) {
                return false;
            }
            n = getNext(n);
        }
        return true;
    }

    public static int getNext(int n){
        int next = 0;
        while (n>0) {
            int digital = n%10;
            next += Math.pow(digital,2);
            n = n / 10;
        }
        return next;
    }

    public static void main(String[] args) {
        int next = getNext(7);
        System.out.println(next);
        boolean happy = isHappy(7);
        System.out.println(happy);
        System.out.println(2%10);
    }
}
