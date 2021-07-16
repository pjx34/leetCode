import java.util.HashSet;

//给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
public class LC0034相交链表 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA!=null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB !=null) {
            if (set.add(headB) == false)
                return headB;
            headB = headB.next;
        }
        return null;
    }
}
