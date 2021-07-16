public class LeetCode0016 {

    //ţ�ٵ���������
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double C = x, x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + C / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }

    public int mySqrt3(int x) {
        // ����ֵ�ж�
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int left = 1;
        int right = x / 2;
        // ������ [left..right] ����Ŀ��Ԫ��
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            // ע�⣺����Ϊ�˱���˷���������ó���
            if (mid > x / mid) {
                // ��һ������������ [left..mid - 1]
                right = mid - 1;
            } else {
                // ��һ������������ [mid..right]
                left = mid;
            }
        }
        return left;
    }

    //TODO:���ַ�����
    public static int mySqrt1(int x){
        // ����ֵ�ж�
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int left = 1;
        int right = x/2;
        //double mid = left + (right - left + 1) / 2;;
        while (left<right){
           int mid = left + (right - left + 1) / 2;;
            if (mid>x/mid){
                right = mid-1;
            }else {
                left = mid;
            }
        }
        return (int)left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt1(4));
    }
}
