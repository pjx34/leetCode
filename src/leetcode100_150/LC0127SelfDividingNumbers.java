package leetcode100_150;

import java.util.ArrayList;
import java.util.List;

//自除数?是指可以被它包含的每一位数除尽的数。
//例如，128 是一个自除数，因为?128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
//还有，自除数不允许包含 0 。
//给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
//示例 1
//输入：
//上边界left = 1, 下边界right = 22
//输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
public class LC0127SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if (isZCS(i))
                list.add(i);
        }
        return list;
    }

    public static boolean isZCS(int num) {
        int a = num;
        do{
            int digital = a%10;
            if (digital==0||(digital!=0&&num%digital!=0)){
                return false;
            }
            a = a/10;
        }while (a!=0);
        return true;
    }

    public static void main(String[] args) {
        boolean zcs = isZCS(10);
        System.out.println(zcs);

        List<Integer> integers = selfDividingNumbers(1, 22);
        System.out.println(integers);
    }

}
