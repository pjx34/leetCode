//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//        All letters in this word are capitals, like "USA".
//        All letters in this word are not capitals, like "leetcode".
//        Only the first letter in this word is capital, like "Google".
//        Given a string word, return true if the usage of capitals in it is right.
public class LC0098DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
            return true;
        String s = word.charAt(0)+"";
        String replace = word.toLowerCase().replaceFirst(word.toLowerCase().charAt(0) + "", s.toUpperCase());
        return replace.equals(word);
    }

    public static void main(String[] args) {
        String s = "Amazon";
        System.out.println(detectCapitalUse(s));
    }
}
