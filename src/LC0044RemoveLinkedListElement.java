//����һ�������ͷ�ڵ� head ��һ������ val ������ɾ���������������� Node.val == val �Ľڵ㣬������ �µ�ͷ�ڵ� ��
public class LC0044RemoveLinkedListElement {

    //�ݹ�
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    //����
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
