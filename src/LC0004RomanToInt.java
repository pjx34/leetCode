/*
 I             1
V             5
X             10
L             50
C             100
D             500
M             1000

*
*
*
*
* */

import java.util.HashMap;

public class LC0004RomanToInt {
    public static void main(String[] args) {
        int res = romanToInt("III");
        System.out.println(res);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        int res = 0;
        for (int i=0;i<s.length();++i) {
            if((i<s.length()-1&&map.get(s.charAt(i))>=map.get(s.charAt(i+1)))||(i==s.length()-1)) {
                res += map.get(s.charAt(i));
            }else{
                res -= map.get(s.charAt(i));
            }
        }
        return res;
    }
}
