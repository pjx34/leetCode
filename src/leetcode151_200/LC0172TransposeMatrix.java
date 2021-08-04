package leetcode151_200;
//����һ����ά�������� matrix��?���� matrix �� ת�þ��� ��
//����� ת�� ��ָ����������Խ��߷�ת���������������������������
//ʾ�� 1��
//���룺matrix =
// [[1,2,3],
// [4,5,6]
// ,[7,8,9]]
//�����[[1,4,7],[2,5,8],[3,6,9]]
public class LC0172TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newArr = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];//{1,2,3}  {4,5,6}  {7,8,9}
            for (int j = 0; j < matrix[0].length; j++) {
                newArr[j][i] = matrix[i][j];
            }
        }
        return newArr;
    }
}
