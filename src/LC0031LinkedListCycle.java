import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//����һ�������ж��������Ƿ��л���
//
//        �����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���������д��ڻ��� Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� ��� pos �� -1�����ڸ�������û�л���ע�⣺pos ����Ϊ�������д��ݣ�������Ϊ�˱�ʶ�����ʵ�������
//
//        ��������д��ڻ����򷵻� true �� ���򣬷��� false ��
//        ��
public class LC0031LinkedListCycle {

    //ʹ��hashSet��¼�Ѿ��������Ľڵ�
    public boolean hasCycle1(ListNode head) {
        Set set = new HashSet<ListNode>();
        while (head!=null){
            if (set.add(head) == false){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    //�������� ����ָ��
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != fast) {
            if (fast == null || fast.next==null)
                return false;
            fast = head.next.next;
            slow = slow.next;
        }
        return true;
    }
}
