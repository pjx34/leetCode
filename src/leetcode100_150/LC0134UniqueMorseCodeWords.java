package leetcode100_150;

import java.util.HashMap;

public class LC0134UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] strings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> map = new HashMap<>();
        char a = 'a';
        for (int i = 0; i < strings.length; i++) {
            map.put(a++,strings[i]);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println((int)'a');
    }


}
