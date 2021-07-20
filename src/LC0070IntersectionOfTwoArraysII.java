//�����������飬��дһ���������������ǵĽ�����
//
//?
//
//ʾ�� 1��
//
//���룺nums1 = [1,2,2,1], nums2 = [2,2]
//�����[2,2]
//ʾ�� 2:
//
//���룺nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//�����[4,9]
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0070IntersectionOfTwoArraysII {

    //���� + ˫ָ��
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (p1<len1&&p2<len2){
            if (nums1[p1] == nums2[p2]){
                list.add(nums1[p1]);
                p1++;
                p2++;
            }else if (nums1[p1] < nums2[p2])
                p1++;
            else if (nums1[p1] > nums2[p2])
                p2++;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 2, 2, 1};
        int[] ints2 =  {2,2};
        int[] intersect = intersect(ints1, ints2);
        System.out.println(Arrays.toString(intersect));
    }
}
