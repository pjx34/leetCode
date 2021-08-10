package leetcode151_200;

import java.util.Arrays;

//���� R �� C �еľ������еĵ�Ԫ�����������Ϊ (r, c)������ 0 <= r < R �� 0 <= c < C��
//
//        ���⣬�����ڸþ����и�����һ������Ϊ (r0, c0) �ĵ�Ԫ��
//        ���ؾ����е����е�Ԫ������꣬������ (r0, c0) �ľ������С������˳���ţ����У�����Ԫ��(r1, c1) �� (r2, c2) ֮��ľ����������پ��룬|r1 - r2| + |c1 - c2|��������԰��κ������������˳�򷵻ش𰸡���
//        ʾ�� 1��
//
//        ���룺R = 1, C = 2, r0 = 0, c0 = 0
//        �����
//        [
//        [0,0],
//        [0,1]
//        ]
//        ���ͣ��� (r0, c0) ��������Ԫ��ľ���Ϊ��[0,1]
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
