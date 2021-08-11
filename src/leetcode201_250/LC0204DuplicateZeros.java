package leetcode201_250;

import java.util.ArrayList;

//给你一个长度固定的整数数组?arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
//
//注意：请不要在超过该数组长度的位置写入元素。
//
//要求：请对输入的数组?就地?进行上述修改，不要从函数返回任何东西。
//示例 1：
//
//输入：[1,0,2,3,0,4,5,0]
//输出：null
//解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
public class LC0204DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length,count = 0,num = 0;
        for (int i = 0; i < length; i++) {
            if (arr[count] == 0){
                i++;
                num++;//0的个数
            }
            count++;
        }
        int j = count + num > length?count - 1:-1;//判断边界0是否复写
        count--;
       //从count后边的都舍弃，所以将count位置的移到最末尾，是0就复写，要判断边界0的情况
        for (int i = length - 1; i >= 0; i--) {
            arr[i] = arr[count];
            if (arr[i] == 0 && count != j)
                if (--i > 0)
                    arr[i] = 0;
            count--;
        }
    }
}
