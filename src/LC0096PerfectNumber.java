import java.util.HashSet;

//对于一个?正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
//
//给定一个?整数?n，?如果是完美数，返回 true，否则返回 false
//
//?
//
//示例 1：
//
//输入：28
//输出：True
//解释：28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, 和 14 是 28 的所有正因子。
public class LC0096PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        HashSet<Integer> set = new HashSet<>();
        int num_ = num;
        for (int i = 1; i < num; i++) {
            if (num%i==0)
                set.add(i);
        }
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(8128));
    }
}
