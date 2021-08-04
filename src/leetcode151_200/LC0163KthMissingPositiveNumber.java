package leetcode151_200;

import java.util.ArrayList;

public class LC0163KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> missingList = new ArrayList<>();
        if (arr[0]>1){
            for (int i = 1; i <= arr[0]-1; i++) {
                missingList.add(i);
            }
        }
        for (int i = 0; i+1 < arr.length; i++) {
            if (arr[i+1]-arr[i]!=1){
                for (int j = 1; j < arr[i+1]-arr[i]; j++) {
                    missingList.add(arr[i]+j);
                }
            }
        }
        return missingList.size()>=k?missingList.get(k-1):arr[arr.length-1]+k-missingList.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int kthPositive = findKthPositive(arr, k);
        System.out.println(kthPositive);
    }
}
