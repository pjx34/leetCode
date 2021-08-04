package leetcode151_200;
//给定一个正整数 n，找到并返回 n 的二进制表示中两个 相邻 1 之间的 最长距离 。如果不存在两个相邻的 1，返回 0 。
//
//如果只有 0 将两个 1 分隔开（可能不存在 0 ），则认为这两个 1 彼此 相邻 。两个 1 之间的距离是它们的二进制表示中位置的绝对差。例如，"1001" 中的两个 1 的距离为 3 。
public class LC0174BinaryGap {
    public static int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int count = 0;
        boolean isCount = false;//是否开始计算
        while (n!=0) {
            int remainder = n%2;
                sb.append(remainder);
            n /= 2;
            if (isCount)
                count++;
            if (remainder==1&&!isCount){
                count=0;
                isCount = true;
            }
            else if (remainder==1&&isCount){
                max = Math.max(count,max);
                count=0;
            }
        }
        System.out.println(sb.reverse().toString());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(4));
    }
}
