package leetcode100_150;

import java.util.ArrayList;

public class LC0138ShortestDistanceToACharacter {
    public static int[] shortestToChar1(String s, char c) {
        int fromIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (s.indexOf(c,fromIndex)!=-1){
            list.add(s.indexOf(c,fromIndex++));
        }
        int[] res = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            res[i] = Integer.MAX_VALUE;
//        }
        for (int i = 0; i < s.length(); i++) {
            //i 0,1,2,3,4,5,6,7,8,9
            for (Integer indexOfC : list) {
                //indexOfC 3,5,6,11
                if (list.contains(i)){
                    res[i] = 0;
                }else{
                    if (res[i]==0)
                        res[i] = Math.abs(indexOfC-i);
                    else
                        res[i] = Math.min(res[i],Math.abs(indexOfC-i));
                }
            }
        }
        return res;
    }


    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int pre = Integer.MIN_VALUE/2; //上一个c出现的下标
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c)
                pre = i;
            res[i] = i- pre;
        }
        pre = Integer.MAX_VALUE/2;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)==c)
                pre = i;
            res[i] = Math.min(res[i],pre-i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = s = "loveleetcode";
        char c = 'e';
        int[] ints = shortestToChar(s, c);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
}

}
