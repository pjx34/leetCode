//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
public class LC0044RemoveLinkedListElement {

    //递归
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    //遍历
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode tmp = dummyHead;
        while (tmp.next!=null){
            if (tmp.next.val == val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return dummyHead.next;
    }




}
