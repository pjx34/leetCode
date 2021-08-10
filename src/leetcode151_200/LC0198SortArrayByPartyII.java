package leetcode151_200;

import java.util.Arrays;

//����һ���Ǹ���������?A�� A ��һ��������������һ��������ż����
//
//��������������Ա㵱?A[i] Ϊ����ʱ��i?Ҳ����������?A[i]?Ϊż��ʱ�� i Ҳ��ż����
//
//����Է����κ���������������������Ϊ�𰸡�
public class LC0198SortArrayByPartyII {
    public static int[] sortArrayByParityII1(int[] nums) {
        int p1 = 0;//ż���±�
        int p2 = 0;//�����±�
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                while (nums[p1]%2!=0){
                    p1++;
                }
                res[i] = nums[p1];
                p1++;
            }else{
                while (nums[p2]%2==0){
                    p2++;
                }
                res[i] = nums[p2];
                p2++;
            }
        }
        return res;
    }

    //˫ָ�룬һ��������һ��ż����������������ż��+2���ɡ�
    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int pOdd = 0;
        int pEven = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                res[pOdd] = nums[i];
                pOdd+=2;
            }else{
                res[pEven] = nums[i];
                pEven += 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {4, 2, 5, 7};
        int[] ints1 = sortArrayByParityII(ints);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }
    }
}
