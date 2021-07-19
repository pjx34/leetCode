//��дһ���㷨���ж�һ���� n �ǲ��ǿ�������
//
//        ��������������Ϊ��
//
//        ����һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���͡�
//        Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ������ ����ѭ�� ��ʼ�ձ䲻�� 1��
//        ��� ���Ա�Ϊ? 1����ô��������ǿ�������


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
