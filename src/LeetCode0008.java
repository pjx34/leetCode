//删除有序数组的重复项

public class LeetCode0008 {

    public int removeDuplicates(int[] nums) {
        if (nums == null||nums.length ==0) return 0;
        int slow = 1;
        int fast = 0;
        while (fast<nums.length-1) {
            if (nums[fast]<nums[fast+1]){
                nums[slow] = nums[fast+1];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
