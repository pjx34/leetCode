//颠倒给定的 32 位无符号整数的二进制位。

public class LC0041ReverseBit {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(Integer.reverse(1110001001));
    }
}
