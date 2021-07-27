package leetcode100_150;

//���� s ������ 1 ��?n?�����������ҵ��ǣ���Ϊ���ݴ��󣬵��¼�������ĳһ�����ָ����˳��˼������������һ�����ֵ�ֵ�����¼��� ��ʧ��һ������ ���� ��һ�������ظ� ��
//
//����һ������ nums �����˼��� S ���������Ľ����
//
//�����ҳ��ظ����ֵ����������ҵ���ʧ�����������������������ʽ���ء�
//
//?
//
//ʾ�� 1��
//
//���룺nums = [1,2,2,4]
//�����[2,3]
//ʾ�� 2��
//
//���룺nums = [1,1]
//�����[1,2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LC0119SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            list.add(nums[i]);
        }
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (i+1<nums.length&&nums[i]==nums[i+1]&&flag){
                res[0] = nums[i];  //�ظ�������
                flag = !flag;
            }
            if (i+1!=0&&!list.contains(i+1)){
                res[1] = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,5,3,2,2,7,6,4,8,9};
        int[] errorNums = findErrorNums(ints);
        for (int errorNum : errorNums) {
            System.out.println(errorNum);
        }
    }
}
