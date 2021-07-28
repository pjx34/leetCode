package leetcode100_150;
//给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
//
//如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
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
