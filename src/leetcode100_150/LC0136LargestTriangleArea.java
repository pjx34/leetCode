package leetcode100_150;
//�������������ļ��ϣ�������ȡ��������������Σ���������ɵ���������ε������
//
//ʾ��:
//����: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//���: 2
//����:
//�����������ͼ��ʾ����ɵĳ�ɫ�����������ģ����Ϊ2��
public class LC0136LargestTriangleArea {
    //
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len ; j++) {
                for (int k = j+1; k < len; k++) {
                    ans = Math.max(ans,area(points[i],points[j],points[k]));
                }
            }
        }
        return ans;
    }

    //Ь����ʽ
    public double area(int[] p,int[] q, int [] r){
        return 0.5*Math.abs((p[0]*q[1]+q[0]*r[1]+r[0]*p[1])-(q[0]*p[1]+r[0]*q[1]+p[0]*r[1]));
    }
}
