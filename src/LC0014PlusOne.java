import java.util.Arrays;

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//你可以假设除了整数 0 之外，这个整数不会以零开头。
public class LC0014PlusOne {
    public static void main(String[] args) {
        int[] ints = {9,8,9};
        int[] ints1 = plusOne(ints);
        System.out.println(Arrays.toString(ints1));
    }


    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        if (digits[length-1]!=9){
            digits[length-1] = digits[length-1] + 1;
            return digits;
        }
        boolean flag = true;//是否进位
        boolean isNewArray = false;//是否新数组
        int[] res = new int[length + 1];
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]==9 && flag){
                flag = true;
                digits[i] = 0;
            }else if(digits[i]!=9 && flag){
                flag = false;
                digits[i] = digits[i] + 1;
            }else if(digits[i]!=9 && !flag){
                flag = false;
                digits[i] = digits[i];
            }
        }
        if (flag) {
            isNewArray = true;
            int i = 1;
            res[0] = 1;
            for (int j = 0; j < length; j++) {
                res[i] = digits[j];
            }
        }
        return isNewArray?res:digits;
    }

}
