import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

// ��¥��
// ������������¥�ݡ���Ҫ n ������ܵ���¥����ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�ע�⣺���� n ��һ����������
public class LC0017ClimbStairs {
    static Map<Integer,Integer> map = new HashMap<>();

    //�ݹ�
    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    //�ݹ�ʱʹ��map�����ʱ������
    public static int climbStairs_map(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int num = 0;
        if(map.get(n)!=null)
            return (int)map.get(n);
        else{
            num = climbStairs(n-1) + climbStairs(n-2);
            map.put(n,num);
        }
        return num;
    }

    //��̬�滮
    public static int climbStairs_dp(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        long start3 = System.currentTimeMillis();
        int k = climbStairs_map(45);
        long end3 = System.currentTimeMillis();
        System.out.println("�ݹ��map��ʱ:"+(end3 - start3));

        long start2 = System.currentTimeMillis();
        int j = climbStairs(45);
        long end2 = System.currentTimeMillis();
        System.out.println("�ݹ���ʱ:"+(end2 - start2));

        long start1 = System.currentTimeMillis();
        int i = climbStairs_dp(45);
        long end1 = System.currentTimeMillis();
        System.out.println("dp��ʱ:"+(end1 - start1));
    }
}
