//leetcode第三题 回文数
public class LC0003Palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        if (x<0||(x%10==0&&x!=0)) return false;
        long res = 0;
        while (x != 0){
            long digital = x % 10;
            x = x / 10;
            res = res * 10 + digital;
        }
        return res == original?true:false;
    }

    public static boolean isPalindrome1(int x){
        if(x<0||(x%10==0&&x!=0)) return false;
        int res = 0;
        while(res < x) {
            int lastNum = x % 10;
            x = x / 10;
            res = res*10 + lastNum;
        }
        return x ==res || x == res/10;
    }
}
