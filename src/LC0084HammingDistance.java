//��������֮��� �������� ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
//
//������������ x �� y�����㲢��������֮��ĺ������롣
//
//?
//
//ʾ�� 1��
//
//���룺x = 1, y = 4
//�����2
//���ͣ�
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ��   ��
//����ļ�ͷָ���˶�Ӧ������λ��ͬ��λ�á�
public class LC0084HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }


    public static void main(String[] args) {
        int a = 10;
        String s = Integer.toBinaryString(10);
        System.out.println(s);
    }
}
