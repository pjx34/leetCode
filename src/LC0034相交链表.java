import java.util.HashSet;

//���������������ͷ�ڵ� headA �� headB �������ҳ������������������ཻ����ʼ�ڵ㡣�����������û�н��㣬���� null ��
public class LC0034�ཻ���� {

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
