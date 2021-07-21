//实现 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

public class LC0010StrStr {
    public static void main(String[] args) {
       String haystack = "hello", needle = "ll";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }

    //方法一: 直接调用内置函数
//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }

    //方法二: 爆破
    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i+len2<= len1; i++) {
            String substring = haystack.substring(i, i + len2);
            if(substring .equals(needle))
                return i;
        }
        return -1;
    }
}
