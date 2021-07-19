import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//����һ�����ظ�Ԫ�ص������������� nums ��
//
//        ���� ǡ�ø����������������� �� ��С���� ���䷶Χ�б�Ҳ����˵��nums ��ÿ��Ԫ�ض�ǡ�ñ�ĳ�����䷶Χ�����ǣ����Ҳ���������ĳ����Χ�������� nums ������ x ��
//
//        �б��е�ÿ�����䷶Χ [a,b] Ӧ�ð����¸�ʽ�����
//
//        "a->b" ����� a != b
//        "a" ����� a == b
//        ?
//
//        ʾ�� 1��
//
//        ���룺nums = [0,1,2,4,5,7]
//        �����["0->2","4->5","7"]
//        ���ͣ����䷶Χ�ǣ�
//        [0,2] --> "0->2"
//        [4,5] --> "4->5"
//        [7,7] --> "7"


public class LC0052SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        int len = nums.length;
        if (len==0)
            return list;
        int count = 0;
        int i = 0;
        for (i = 0; i < len-1; i++) {
            if (Math.abs(nums[i+1]-nums[i])==1){
                count++;
            }
            if (Math.abs(nums[i+1]-nums[i])>1){
                if (count == 0){
                    list.add(nums[i]+"");
                }else {
                    list.add(nums[i-count]+"->"+nums[i]);
                }
                count = 0;
            }

        }
        if (count==0){
            list.add(nums[i] + "");
        }else {
            list.add(nums[i-count]+"->"+nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = summaryRanges(new int[]{-2147483648,-2147483647,2147483647});
        System.out.println(strings);
    }
}
