package leetcode201_250;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//�������������?arr������ÿ��Ԫ�ض� ����ͬ��

//�����ҵ����о�����С���Բ��Ԫ�ضԣ����Ұ������˳�򷵻ء�
//ʾ�� 1��
//���룺arr = [4,2,1,3]
//�����[[1,2],[2,3],[3,4]]
public class LC0215MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i+1 < arr.length; i++) {
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        for (int i = 0; i+1 < arr.length; i++) {
            if (Math.abs(arr[i]-arr[i+1])==min){
                list.add(arr[i]);
                list.add(arr[i+1]);
                lists.add(new ArrayList<>(list));
                list.clear();
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        lists.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(4);
        lists.add(new ArrayList<>(list));
        System.out.println(lists);

    }
}
