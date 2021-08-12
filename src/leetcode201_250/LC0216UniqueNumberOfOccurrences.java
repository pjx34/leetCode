package leetcode201_250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//����һ����������?arr�������æͳ��������ÿ�����ĳ��ִ�����
//
//���ÿ�����ĳ��ִ������Ƕ�һ�޶��ģ��ͷ���?true�����򷵻� false��
//ʾ�� 1��
//���룺arr = [1,2,2,1,1,3]
//�����true
//���ͣ��ڸ������У�1 ������ 3 �Σ�2 ������ 2 �Σ�3 ֻ������ 1 �Ρ�û���������ĳ��ִ�����ͬ��
public class LC0216UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Integer value : map.values()) {
            if (!set.add(value))
                return false;
        }
        return true;
    }
}
