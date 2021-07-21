//����һ�����������е�����������������ͷ�ڵ� head ������ɾ�������ظ���Ԫ�أ�ʹÿ��Ԫ�� ֻ����һ�� ������ͬ�����������еĽ������

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
