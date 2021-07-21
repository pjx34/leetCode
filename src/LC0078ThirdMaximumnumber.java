import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//����һ���ǿ����飬���ش������� ��������� ����������ڣ��򷵻���������������
public class LC0078ThirdMaximumnumber {
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length-1; i >=0 ;i--) {
            if(set.add(nums[i]))
                count++;
            if (count==3)
                return nums[i];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        System.out.println(thirdMax(ints));;
    }

}
