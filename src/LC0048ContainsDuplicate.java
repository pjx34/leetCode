import java.util.HashSet;

//����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء��������һֵ�������г����������Σ��������� true �����������ÿ��Ԫ�ض�����ͬ���򷵻� false ��
public class LC0048ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Object> set = new HashSet<>();
        for (int item:nums){
            if (!set.add(item))
                return true;
        }
        return false;
    }
}
