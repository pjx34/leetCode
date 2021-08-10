package leetcode151_200;

import java.util.HashMap;

//给定一副牌，每张牌上都写着一个整数。
//
//此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
//
//每组都有?X?张牌。
//组内所有的牌上都写着相同的整数。
//仅当你可选的 X >= 2 时返回?true。
//示例 1：
//输入：[1,2,3,4,4,3,2,1]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
public class LC0195XofAKindInADeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int x = 0;
        for (Integer value : map.values()) {
            if (value>0){
                x = gcd(x,value);
                if (x==1)
                    return false;
            }
        }
        return x>=2;
    }

    // 辗转相除法
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
