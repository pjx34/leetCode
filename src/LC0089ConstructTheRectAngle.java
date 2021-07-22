import java.util.Arrays;

//��Ϊһλweb�����ߣ� ��������ȥ�滮һ��ҳ��ĳߴ��Ǻ���Ҫ�ġ� �ָ���һ������ľ���ҳ�������������������һ������Ϊ L �Ϳ��Ϊ W ����������Ҫ��ľ��ε�ҳ�档Ҫ��
//
//1. ����Ƶľ���ҳ�������ڸ�����Ŀ�������
//
//2. ��� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
//
//3. ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С��
//����Ҫ��˳���������Ƶ�ҳ��ĳ��� L �Ϳ�� W��
//
//ʾ����
//
//����: 4
//���: [2, 2]
//����: Ŀ������� 4�� ���п��ܵĹ��췽���� [1,4], [2,2], [4,1]��
//���Ǹ���Ҫ��2��[1,4] ������Ҫ��; ����Ҫ��3��[2,2] �� [4,1] ���ܷ���Ҫ��. ����������� L Ϊ 2�� ��� W Ϊ 2��
public class LC0089ConstructTheRectAngle {
    public static int[] constructRectangle(int area) {
        int[] res = new int[2];
        int min = area;
        for (int l = area; l >= 1; l--) {
            if (area%l==0){
                if (l>=area/l&&l-area/l<min){
                    min = l - l/area;
                    res[0] = l;
                    res[1] = area/l;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = constructRectangle(37);
        for (int item : res) {
            System.out.println(item);
        }
    }
}
