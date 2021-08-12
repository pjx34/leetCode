package leetcode201_250;

import java.util.HashMap;
import java.util.Map;

//̩����������?Tn?�������£�?
//
//T0 = 0, T1 = 1, T2 = 1, ���� n >= 0?�������� Tn+3 = Tn + Tn+1 + Tn+2
//
//��������?n���뷵�ص� n ��̩��������?Tn ��ֵ��
//ʾ�� 1��
//
//���룺n = 4
//�����4
//���ͣ�
//T_3 = 0 + 1 + 1 = 2
//T_4 = 1 + 1 + 2 = 4
public class LC0209NthTribonacciNumber {

    static HashMap map = new HashMap<Integer,Integer>();
    public static int tribonacci1(int n) {
        if (map.containsKey(n)){
            return (int)map.get(n);
        }
        if (n==0){
            map.put(n,0);
            return 0;
        }
        if (n<=2){
            map.put(n,1);
            return 1;
        }
        int res = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        map.put(n,res);
        return res;
    }

    //dp��̬�滮
    public static int tribonacci(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 1;
        int p = 0,q = 0,r = 1, s = 1;
        for (int i = 3; i <= n ; i++) {
            p = q;
            q = r;
            r = s;
            s = p+q+r;
        }
        return s;
    }

    public static int feibonacci(int n){
        if (n<=1)
            return n;
        int p = 0,q = 1,s = 0;
        for (int i = 0; i < n; i++) {
            p = q;
            q = s;
            s = p+q;
        }
        return s;
    }


    public static void main(String[] args) {
        System.out.println(feibonacci(10));
    }
}
