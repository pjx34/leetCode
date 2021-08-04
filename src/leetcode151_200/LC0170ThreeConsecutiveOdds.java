package leetcode151_200;

//给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
public class LC0170ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                count = 0;
            } else {
                count++;
                if (count==3)
                    return true;
            }
        }
        return false;
    }
}
