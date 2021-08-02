package leetcode151_200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//对于非负整数?X?而言，X?的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果?X = 1231，那么其数组形式为?[1,2,3,1]。
//
//给定非负整数 X 的数组形式?A，返回整数?X+K?的数组形式。
//示例 1：
//
//输入：A = [1,2,0,0], K = 34
//输出：[1,2,3,4]
//解释：1200 + 34 = 1234
public class LC0151AddToArrayFromToInteger {
    public static List<Integer> addToArrayForm1(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean isJ = false; //是否进位
        for (int i = num.length-1; i >=0 ; i--) {
            int digital = k%10;
            if (digital+num[i]>=9&&isJ){
                isJ = true;
                list.add((num[i]+digital+1)%10);
            }else if (digital+num[i]>=10&&!isJ){
                isJ = true;
                list.add((num[i]+digital)%10);
            }else if (digital+num[i]<=9&&!isJ){
                isJ = false;
                list.add(num[i]+digital);
            }else if (digital+num[i]<=8&&isJ){
                isJ = false;
                list.add(num[i]+digital+1);
            }
            k = k/10;
        }
        if (isJ){
            k += 1;
        }
        while (k!=0){
            list.add(k%10);
            k = k/10;
        }
        Collections.reverse(list);
        return list;
    }

    //官方答案
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num.length-1; i >=0 ; i--) {
            int sum  = num[i]+k%10;
            k /= 10;
            if (sum>=10){
                k++;
                sum -= 10;
            }
            list.add(sum);
        }
        while (k!=0){
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] a = {6};
        int k =  809;
        List<Integer> l = addToArrayForm(a, k);
        System.out.println(l);
    }

}
