package leetcode151_200;
//小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
//如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
//请你计算 最多 能喝到多少瓶酒。
public class LC0159WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bottle = numBottles, ans = numBottles;
        while (bottle >= numExchange) {
            bottle -= numExchange;
            ++ans;
            ++bottle;
        }
        return ans;
    }
}
