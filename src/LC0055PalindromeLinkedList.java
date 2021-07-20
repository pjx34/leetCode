import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.ArrayList;

//请判断一个链表是否为回文链表。
//
//示例 1:
//
//输入: 1->2
//输出: false
//示例 2:
//
//输入: 1->2->2->1
//输出: true
public class LC0055PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size()/2; i++) {
            int j = list.size()-i-1;
            if (list.get(i)!=list.get(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = buildList(new int[]{1, 2,2, 1});
        showList(listNode);
        boolean palindrome = isPalindrome(listNode);
        System.out.println(palindrome);
    }

    public static ListNode buildList(int[] arr) {
        ListNode dummyHead = new ListNode();
        ListNode p = dummyHead;
        for (int i = 0; i < arr.length; i++) {
            ListNode next = new ListNode(arr[i]);
            p.next = next;
            p = p.next;
        }
        return dummyHead.next;
    }

    public static void showList(ListNode head){
        while (head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
