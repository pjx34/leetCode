//����һ�����������һ������?k���ж��������Ƿ����������ͬ������?i?��?j��ʹ��?nums [i] = nums [j]������ i �� j?�Ĳ�� ����ֵ ����Ϊ k��

import java.util.HashMap;

public class LC0049ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if (i-map.get(nums[i])<=k)
                    return true;
                else if(i-map.get(nums[i])>k){
                    map.put(nums[i],i);
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints = {1, 0, 1, 1};
        boolean b = containsNearbyDuplicate(ints, 1);
        System.out.println(b);
    }
}
