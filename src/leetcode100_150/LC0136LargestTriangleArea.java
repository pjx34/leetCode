package leetcode100_150;
//给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
//
//示例:
//输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//输出: 2
//解释:
//这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
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

    //鞋带公式
    public double area(int[] p,int[] q, int [] r){
        return 0.5*Math.abs((p[0]*q[1]+q[0]*r[1]+r[0]*p[1])-(q[0]*p[1]+r[0]*q[1]+p[0]*r[1]));
    }
}
