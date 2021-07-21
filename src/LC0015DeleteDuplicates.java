//存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。返回同样按升序排列的结果链表。

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


public class LC0015DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)
            return head;
        ListNode tmp = head;
        while (tmp.next != null){
            if (tmp.val!= tmp.next.val){
                tmp = tmp.next;
            }else {
                tmp.next = tmp.next.next;
            }
        }
        return head;
    }

}
