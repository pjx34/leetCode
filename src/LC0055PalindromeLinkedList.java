import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.ArrayList;

//���ж�һ�������Ƿ�Ϊ��������
//
//ʾ�� 1:
//
//����: 1->2
//���: false
//ʾ�� 2:
//
//����: 1->2->2->1
//���: true
public class LC0055PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size()/2-1; i++) {
            if (list.get(i)!=list.get(list.size()-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(new int[]{1, 2, 2, 1});
        System.out.println(palindrome);
    }

    public static ListNode buildList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
