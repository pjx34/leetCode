package leetcode100_150;
//�������б� [x1, y1, x2, y2] ����ʽ��ʾ������ (x1, y1) Ϊ���½ǵ����꣬(x2, y2) �����Ͻǵ����ꡣ���ε����±�ƽ���� x �ᣬ���ұ�ƽ���� y �ᡣ
//����ཻ�����Ϊ �� ������������ص�����Ҫ��ȷ���ǣ�ֻ�ڽǻ�߽Ӵ����������β������ص���
//������������ rec1 �� rec2 ����������ص������� true�����򣬷��� false ��
//ʾ�� 1��
//���룺rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//�����true
public class LC0142RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec2[1]>=rec1[3]||rec2[3]<=rec1[1]||rec2[0]>=rec1[2]||rec2[2]<=rec1[0]);
    }
}
