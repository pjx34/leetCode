package leetcode100_150;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

//����һ�����г̳��ȱ���ѹ���������б�?nums?��
//����ÿ�����ڵ�����Ԫ�� [freq, val] = [nums[2*i], nums[2*i+1]]?������?i >= 0?����ÿһ�Զ���ʾ��ѹ�����б����� freq?��ֵΪ?val?��Ԫ�أ�����Ҫ�����������������б������ɽ�ѹ����б�
//���㷵�ؽ�ѹ����б�
//ʾ�� 1��
//���룺nums = [1,2,3,4]
//�����[2,4,4,4]
//���ͣ���һ�� [1,2] ������ 2 �ĳ���Ƶ��Ϊ 1�������������� [2]��
//�ڶ��� [3,4] ������ 4 �ĳ���Ƶ��Ϊ 3�������������� [4,4,4]��
//������Ǵ�����һ�� [2] + [4,4,4] = [2,4,4,4]��
public class LC150DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i+1 < nums.length; i+=2) {
                int a = nums[i+1];
                for (int j = 0; j < nums[i]; j++) {
                    list.add(a);
                }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3,4};
        int[] ints1 = decompressRLElist(ints);
        for (int i : ints1) {
            System.out.println(i);
        }
    }
}
