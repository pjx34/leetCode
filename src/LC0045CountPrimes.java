import java.util.Arrays;

public class LC0045CountPrimes {

    public static int countPrimes1(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                count++;

        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n==0||n==1)
            return false;
        int max = (int)Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    //埃氏筛
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        // 从 2 开始枚举到 sqrt(n)。
        for (int i = 2;  i < (int)Math.sqrt(n); i++) {
            // 如果当前是素数
            if (isPrim[i]) {
                // 就把从 i*i 开始，i 的所有倍数都设置为 false。
                for (int j = i * i; j < n; j=j+i) {
                    isPrim[j] = false;
                }
            }
        }

        // 计数
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
