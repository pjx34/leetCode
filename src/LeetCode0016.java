public class LeetCode0016 {

    //牛顿迭代法开方
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
        // 特殊值判断
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        int left = 1;
        int right = x / 2;
        // 在区间 [left..right] 查找目标元素
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            // 注意：这里为了避免乘法溢出，改用除法
            if (mid > x / mid) {
                // 下一轮搜索区间是 [left..mid - 1]
                right = mid - 1;
            } else {
                // 下一轮搜索区间是 [mid..right]
                left = mid;
            }
        }
        return left;
    }

    //TODO:二分法开方
    public static int mySqrt1(int x){
        // 特殊值判断
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
