package leetcode151_200;
//有一个自行车手打算进行一场公路骑行，这条路线总共由?n + 1?个不同海拔的点组成。自行车手从海拔为 0?的点?0?开始骑行。
//
//给你一个长度为 n?的整数数组?gain?，其中 gain[i]?是点 i?和点 i + 1?的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔 。
//示例 1：
//
//输入：gain = [-5,1,5,0,-7]
//输出：1
//解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
public class LC0189FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int last = 0;//上次的高度
        for (int i = 0; i < gain.length; i++) {
            //当前高度
            int h = gain[i]+last;
            last = h;
            max = Math.max(max,h);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {-4,-3,-2,-1,4,3,2};
        int i = largestAltitude(ints);
        System
                .out.println(i);
    }
}
