public class LC0068ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] chars = s.toCharArray();
        while (l<r){
            if(!isVowels(chars[l])){
                l++;
            }
            if (!isVowels(chars[r])){
                r--;
            }
            if (isVowels(chars[l])&&isVowels(chars[r])){
                char tmp = chars[l];
                chars[l] = chars[r];
                chars[r] = tmp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }

    public static boolean isVowels(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }
}
