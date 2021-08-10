package leetcode151_200;

import java.util.Arrays;

//有一堆石头，每块石头的重量都是正整数。
//
//每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为?x 和?y，且?x <= y。那么粉碎的可能结果如下：
//
//如果?x == y，那么两块石头都会被完全粉碎；
//如果?x != y，那么重量为?x?的石头将会完全粉碎，而重量为?y?的石头新重量为?y-x。
//最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
//输入：[2,7,4,1,8,1]
//输出：1
public class LC0200LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int index = stones.length - 1;
        for (int i = 0; i < stones.length - 1; i++){     //最多比较length-1次
            Arrays.sort(stones);
            if (stones[index - 1] == 0) break;           //说明最多只剩一块石头
            stones[index] -= stones[index - 1];          //两种不同情况使用同一表达式处理
            stones[index - 1] = 0;                       //每次比较后肯定会有一块石头被destroyed
        }
        return stones[index];
    }
}
