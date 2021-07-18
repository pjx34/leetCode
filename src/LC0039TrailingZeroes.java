import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

//给定一个整数 n，返回 n! 结果尾数中零的数量。
public class LC0039TrailingZeroes {

    static HashMap  map = new HashMap<Integer, BigInteger>();

    //爆破
    public static int trailingZeroes1(int n) {
        if (n == 0)
            return 0;

        int count = 0;
        BigInteger mul = BigInteger.ONE;
//        while (n!=0){
//            mul = mul.multiply(BigInteger.valueOf(n) ) ;
//            n--;
//        }
        mul = getMul(n);
        while (mul.mod(BigInteger.TEN)==BigInteger.ZERO){
            count++;
            mul = mul.divide(BigInteger.TEN);
        }
        return count;
    }

    public static BigInteger getMul(int n){
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        if (map.get(n)!=null){
            return (BigInteger) map.get(n);
        }
        return BigInteger.valueOf(n).multiply(getMul(n-1));
    }

    public static void main(String[] args) {
        //System.out.println(trailingZeroes(5138));
        System.out.println(getMul(5138));
        System.out.println(15/10);
    }

    //检查5的因子
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        for (int i = 5; i <= n; i += 5) {
            int currentFactor = i;
            while (currentFactor % 5 == 0) {
                zeroCount++;
                currentFactor /= 5;
            }
        }
        return zeroCount;
    }


}
