import java.util.HashSet;

//����һ��?��������������ͳ������������������ ������ ֮����ȣ����ǳ���Ϊ ������������
//
//����һ��?����?n��?����������������� true�����򷵻� false
//
//?
//
//ʾ�� 1��
//
//���룺28
//�����True
//���ͣ�28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, �� 14 �� 28 �����������ӡ�
public class LC0096PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        HashSet<Integer> set = new HashSet<>();
        int num_ = num;
        for (int i = 1; i < num; i++) {
            if (num%i==0)
                set.add(i);
        }
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(8128));
    }
}
