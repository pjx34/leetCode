//给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
//
//如果存在一个整数 x 使得?n == 2x ，则认为 n 是 2 的幂次方。
//


public class LC0053IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(2,i) == n)
                return true;
            if (Math.pow(2,i)>n)
                return false;
        }
        return false;
    }
}
