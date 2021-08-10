package leetcode151_200;

import java.util.Arrays;

//给出 R 行 C 列的矩阵，其中的单元格的整数坐标为 (r, c)，满足 0 <= r < R 且 0 <= c < C。
//
//        另外，我们在该矩阵中给出了一个坐标为 (r0, c0) 的单元格。
//        返回矩阵中的所有单元格的坐标，并按到 (r0, c0) 的距离从最小到最大的顺序排，其中，两单元格(r1, c1) 和 (r2, c2) 之间的距离是曼哈顿距离，|r1 - r2| + |c1 - c2|。（你可以按任何满足此条件的顺序返回答案。）
//        示例 1：
//
//        输入：R = 1, C = 2, r0 = 0, c0 = 0
//        输出：
//        [
//        [0,0],
//        [0,1]
//        ]
//        解释：从 (r0, c0) 到其他单元格的距离为：[0,1]
public class LC0196MatrixCellsInDistanceOrder {
    public static int[][] allCellsDistOrder1(int rows, int cols, int rCenter, int cCenter) {
        int[][] ints = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ints[i] = new int[]{i,j};
            }
        }
        Arrays.sort(ints,(a,b)->(Math.abs(a[0]-rCenter)+Math.abs(a[1]-cCenter))-(Math.abs(b[0]-rCenter)+Math.abs(b[1]-cCenter)));
        return ints;
    }

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ret = new int[rows * cols][];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ret[i * cols + j] = new int[]{i, j};
            }
        }
        Arrays.sort(ret, (a,b) -> {
                return (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) - (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter));
        });
        return ret;
    }

    public static void main(String[] args) {

    }
}
