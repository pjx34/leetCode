//����һ�� row x col �Ķ�ά�����ͼ grid �����У�grid[i][j] = 1 ��ʾ½�أ� grid[i][j] = 0 ��ʾˮ��
//
//�����еĸ��� ˮƽ�ʹ�ֱ �����������Խ��߷�������������������ˮ��ȫ��Χ��������ǡ����һ�����죨����˵��һ��������ʾ½�صĸ���������ɵĵ��죩��
//
//������û�С������������� ָˮ���ڵ����ڲ��Ҳ��͵�����Χ��ˮ�������������Ǳ߳�Ϊ 1 �������Ρ�����Ϊ�����Σ��ҿ�Ⱥ͸߶Ⱦ������� 100 ���������������ܳ���
//
//ʾ�� 1��
//
//
//���룺grid =
// [[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0]
// [1,1,0,0]]
//�����16
//���ͣ������ܳ�������ͼƬ�е� 16 ����ɫ�ı�

public class LC0085IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        int a = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a = 0;//ÿ��½�ظ��ӵ��ܳ�
                if (grid[i][j]==1){
                    if (j-1==-1||grid[i][j-1]==0)
                        a++;
                    if (j+1==col||grid[i][j+1]==0)
                        a++;
                    if (i-1==-1||grid[i-1][j]==0)
                        a++;
                    if (i+1==row||grid[i+1][j]==0)
                        a++;
                }
                sum += a;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1}};
        int i = islandPerimeter(arr);
        System.out.println(i);
    }

}
