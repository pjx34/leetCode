package leetcode100_150;

import java.util.ArrayList;

//��MATLAB�У���һ���ǳ����õĺ��� reshape�������Խ�һ����������Ϊ��һ����С��ͬ���¾��󣬵�������ԭʼ���ݡ�
//����һ���ɶ�ά�����ʾ�ľ����Լ�����������r��c���ֱ��ʾ��Ҫ���ع��ľ����������������
//�ع���ľ�����Ҫ��ԭʼ���������Ԫ������ͬ���б���˳����䡣
//������и���������reshape�����ǿ����Һ���ģ�������µ����ܾ��󣻷������ԭʼ����
//ʾ�� 1:
//
//����:
//nums =
//[[1,2],
// [3,4]]
//r = 1, c = 4
//���:
//[[1,2,3,4]]
//����:
//�б���nums�Ľ���� [1,2,3,4]���µľ����� 1 * 4 ����, ��֮ǰ��Ԫ��ֵһ��һ������¾���
public class LC0106ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row*col!=r*c)
            return mat;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list.add(mat[i][j]);
            }
        }
        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = list.get(index);
                index++;
            }
        }
        return res;
    }
}
