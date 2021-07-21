import java.util.ArrayList;
import java.util.List;

//leetCode第二题 整数反转
public class LC0002ReverseInteger {
    public static void main(String[] args) {
        int reverse = reverse(-123);


        System.out.println("===");
        System.out.println(reverse);
    }

    public static int reverse(int x){
        int b = 0;
        int res = 0;
        int counter = 0;
        do{
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            b = x % 10;
            x = x / 10;
            System.out.println(b);
            res = res * 10 + b;
            //list.add(b);
        }while (x!=0);
//        for(int i=list.size()-1;i>=0;i--) {
//            res = res + (int) ((int)list.get(i)*Math.pow(10.0,counter));
//            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
//                return 0;
//            }
//            counter++;
//        }
        return res;
    }
}
