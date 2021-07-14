//leetCode第五题 最长公共前缀Lcp
public class LeetCode0005 {

    public static void main(String[] args) {
        String[] strs =new String[] {"flow","flower","flight"};
        strs = new String[]{"dog","racecar","car"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
        //System.out.println(getLongestCommonPrefixFromTwoStrings("flo","flow"));

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0){
            return "";
        }
        String tmp = strs[0];
        for (int i = 0; i < strs.length; ++i) {
            tmp = getLongestCommonPrefixFromTwoStrings(tmp,strs[i]);
        }
        return tmp;
    }

    public static String getLongestCommonPrefixFromTwoStrings(String str1,String str2){
        if(str1==null||str2==null||str1==""||str2=="") return "";
        int min = Math.min(str1.length(), str2.length());
        int i;
        for (i = 0; i < min; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                break;
            }
        }
        return str1.substring(0,i);
    }
}
