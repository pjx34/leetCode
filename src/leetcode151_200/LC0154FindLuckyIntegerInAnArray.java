package leetcode151_200;

import java.util.HashMap;
import java.util.Map;

//�����������У����һ�������ĳ���Ƶ�κ�������ֵ��С��ȣ����Ǿͳ��������Ϊ������������
//
//����һ���������� arr����������ҳ�������һ����������
//
//��������д��ڶ����������ֻ�践�� ��� ���Ǹ���
//��������в������������򷵻� -1 ��
public class LC0154FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue() && entry.getValue()>max){
                max = entry.getKey();
            }
        }
        return max;
    }
}
