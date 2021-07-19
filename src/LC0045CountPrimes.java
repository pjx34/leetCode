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

    //����ɸ
    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        Arrays.fill(isPrim, true);
        // �� 2 ��ʼö�ٵ� sqrt(n)��
        for (int i = 2;  i < (int)Math.sqrt(n); i++) {
            // �����ǰ������
            if (isPrim[i]) {
                // �ͰѴ� i*i ��ʼ��i �����б���������Ϊ false��
                for (int j = i * i; j < n; j=j+i) {
                    isPrim[j] = false;
                }
            }
        }

        // ����
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrim[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
