import javax.crypto.spec.PSource;

//����һ�� ������ num ����дһ����������� num ��һ����ȫƽ�������򷵻� true �����򷵻� false ��
//
//���ף���Ҫ ʹ���κ����õĿ⺯������? sqrt ��
//
//?
public class LC0071ValidPerfactSquare {
    public static boolean isPerfectSquare1(int num) {
        if (num < 2) {
            return true;
        }
        int l = 0;
        int r = num/2;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (mid == (num+0.0) / mid){
                return true;
            }else if(mid > (num+0.0) / mid ){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return false;
    }

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //System.out.println(isPerfectSquare(4));
    }

}
