//���ܹ���?n?öӲ�ң�����Ҫ�����ǰڳ�һ��������״����?k?�оͱ���������?k?öӲ�ҡ�
//
//����һ������?n���ҳ����γ����������е���������
//
//n?��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�
//
//ʾ�� 1:
//
//n = 5
//
//Ӳ�ҿ����г����¼���:
//��
//�� ��
//�� ��
//
//��Ϊ�����в����������Է���2.
//ʾ�� 2:
//
//n = 8
//
//Ӳ�ҿ����г����¼���:
//��
//�� ��
//�� �� ��
//�� ��
//
//��Ϊ�����в����������Է���3.
public class LC0081ArrangingCoins {
    public static int arrangeCoins(long n) {
        //�ı�һЩ��������,��ֹint���
        if(n<3)
        {
            return 1;
        }
        else
        {
            long left=0;
            long right=n;
            long temp=0;
            while(left<=right)
            {
                long mid=(left+right)/2;
                //�����ĵȲ��������
                if(mid*mid+mid>2*n)
                {
                    right=mid-1;
                }
                else
                {
                    //�Ȳ�����return,��һ����û���ҵ���ӽ�����?
                    temp=mid;
                    left=mid+1;
                }
            }
            return (int)temp;
        }
    }


    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
