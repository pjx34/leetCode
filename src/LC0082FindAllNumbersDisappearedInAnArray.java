import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//����һ���� n ������������ nums ������ nums[i] ������ [1, n] �ڡ������ҳ������� [1, n] ��Χ�ڵ�û�г����� nums �е����֣������������ʽ���ؽ����
//
//?
//
//ʾ�� 1��
//
//���룺nums = [4,3,2,7,8,2,3,1]
//�����[5,6]
//ʾ�� 2��
//
//���룺nums = [1,1]
//�����[2]
//
public class LC0082FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(set.add(i))
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] ints  = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(ints);
        System.out.println(list);

        String s;
    }

}
