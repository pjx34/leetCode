//�����������飬��дһ���������������ǵĽ�����
//
//?
//
//ʾ�� 1��
//
//���룺nums1 = [1,2,2,1], nums2 = [2,2]
//�����[2]
//ʾ�� 2��
//
//���룺nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//�����[9,4]

import java.util.ArrayList;
import java.util.HashSet;

public class LC0069IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : nums1){
            set1.add(item);
        }
        for (int item : nums2){
            set2.add(item);
        }
        for (int item : set2){
            if (!set1.add(item)){
                list.add((int)item);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
