package leetcode100_150;
//����һ�� m x n �ľ��� matrix ���������������������ľ��󣬷��� true �����򣬷��� false ��
//
//���������ÿһ�������ϵ����µĶԽ����ϵ�Ԫ�ض���ͬ����ô��������� �������ľ��� ��
public class LC0130ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                if (i+1<row&&j+1<col&&matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}
