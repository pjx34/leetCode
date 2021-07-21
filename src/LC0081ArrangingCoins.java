//你总共有?n?枚硬币，你需要将它们摆成一个阶梯形状，第?k?行就必须正好有?k?枚硬币。
//
//给定一个数字?n，找出可形成完整阶梯行的总行数。
//
//n?是一个非负整数，并且在32位有符号整型的范围内。
//
//示例 1:
//
//n = 5
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤
//
//因为第三行不完整，所以返回2.
//示例 2:
//
//n = 8
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//因为第四行不完整，所以返回3.
public class LC0081ArrangingCoins {
    public static int arrangeCoins(long n) {
        //改变一些参数类型,防止int溢出
        if(n<3)
        {
            return 1;
        }
        else
        {
            long left=0;
            long right=n;
            long temp=0;
            while(left<=right)
            {
                long mid=(left+right)/2;
                //基本的等差数列求和
                if(mid*mid+mid>2*n)
                {
                    right=mid-1;
                }
                else
                {
                    //先不急着return,万一我们没有找到最接近的呢?
                    temp=mid;
                    left=mid+1;
                }
            }
            return (int)temp;
        }
    }


    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
