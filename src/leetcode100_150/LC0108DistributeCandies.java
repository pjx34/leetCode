package leetcode100_150;

import java.util.HashSet;

//����һ��ż�����ȵ����飬���в�ͬ�����ִ����Ų�ͬ������ǹ���ÿһ�����ִ���һ���ǹ�������Ҫ����Щ�ǹ�ƽ���ָ�һ���ܵܺ�һ�����á��������ÿ��Ի�õ�����ǹ�����������
//
//ʾ�� 1:
//
//����: candies = [1,1,2,2,3,3]
//���: 3
//����: һ��������������ǹ���ÿһ�ֶ���������
//     ���ŷ��䷽�������û��[1,2,3],�ܵ�Ҳ���[1,2,3]������ʹ���û���ǹ�����������ࡣ
public class LC0108DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int item : candyType) {
            set.add(item);
        }
        if (set.size()>candyType.length/2)
            return candyType.length/2;
        else
            return set.size();
    }
}
