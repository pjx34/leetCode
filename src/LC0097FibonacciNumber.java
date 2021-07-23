//쳲���������ͨ����?F(n) ��ʾ���γɵ����г�Ϊ 쳲��������� ����������?0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�
//
//F(0) = 0��F(1)?= 1
//F(n) = F(n - 1) + F(n - 2)������ n > 1
//���� n ������� F(n) ��
public class LC0097FibonacciNumber {

    //�ݹ�
    public int fib1(int n) {
        if (n<2)
            return n;
        return fib1(n-1)+fib1(n-2);
    }

    //��̬�滮 ֻҪ��¼ǰ����״̬,���Կ����Ż��ɳ����ռ�
    public int fib(int n){
        if (n<2)
            return n;
        int a = 0, b = 1, c;
        while (n-->1) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
