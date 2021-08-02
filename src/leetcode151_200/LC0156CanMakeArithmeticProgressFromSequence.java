package leetcode151_200;

import java.util.Arrays;

//����һ���������� arr ��
//���һ�������У�������������Ĳ��ܵ���ͬһ����������ô������оͳ�Ϊ �Ȳ����� ��
//��������������������γɵȲ����У��뷵�� true �����򣬷��� false
public class LC0156CanMakeArithmeticProgressFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i+1 < arr.length; i++) {
            if (arr[i+1]-arr[i]!=arr[1]-arr[0])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        boolean b = canMakeArithmeticProgression(arr);
        System.out.println(b);
    }
}
