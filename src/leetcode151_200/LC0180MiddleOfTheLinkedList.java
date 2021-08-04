package leetcode151_200;

import utils.ListNode;

import java.util.ArrayList;

public class LC0180MiddleOfTheLinkedList {
    //遍历节点放入list中
    public ListNode middleNode1(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head!=null){
            list.add(head);
            head = head.next;
        }
        int size = list.size();
        return list.get(size/2);
    }

    //快慢指针 快指针走两步 慢指针走一步
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
