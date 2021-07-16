//����һ�����������ҳ��������ȡ������������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����

import java.util.Arrays;

public class LeetCode0023 {

    public int maxDepth(TreeNode root) {
        if (root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {6, 5, 8, 7, 9, 1, 3, 4, 2};

        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
