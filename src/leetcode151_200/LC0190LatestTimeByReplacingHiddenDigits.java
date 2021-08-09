package leetcode151_200;

public class LC0190LatestTimeByReplacingHiddenDigits {
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();

        if (chars[0]=='?'){
            if (chars[1]>=4&&chars[1]<=9)
                chars[0] = '1';
            else
                chars[0] = '2';
        }

        if (chars[1]=='?'){
            if (chars[0]=='2')
                chars[1] = '3';
            else
                chars[1] = '9';
        }
        if (chars[3]=='?')
            chars[3] = '5';
        if (chars[4] =='?')
            chars[4] = '9';
        return new String(chars);
    }
}
