//����һ������ n�������жϸ������Ƿ��� 2 ���ݴη�������ǣ����� true �����򣬷��� false ��
//
//�������һ������ x ʹ��?n == 2x ������Ϊ n �� 2 ���ݴη���
//


public class LC0053IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(2,i) == n)
                return true;
            if (Math.pow(2,i)>n)
                return false;
        }
        return false;
    }
}
