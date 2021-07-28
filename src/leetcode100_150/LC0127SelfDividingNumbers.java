package leetcode100_150;

import java.util.ArrayList;
import java.util.List;

//�Գ���?��ָ���Ա���������ÿһλ������������
//���磬128 ��һ���Գ�������Ϊ?128 % 1 == 0��128 % 2 == 0��128 % 8 == 0��
//���У��Գ������������ 0 ��
//�����ϱ߽���±߽����֣����һ���б��б��Ԫ���Ǳ߽磨���߽磩�����е��Գ�����
//ʾ�� 1
//���룺
//�ϱ߽�left = 1, �±߽�right = 22
//����� [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
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
