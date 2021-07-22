//有一个密钥字符串 S ，只包含字母，数字以及 '-'（破折号）。其中， N 个 '-' 将字符串分成了 N+1 组。
//
//给你一个数字 K，请你重新格式化字符串，使每个分组恰好包含 K 个字符。特别地，第一个分组包含的字符个数必须小于等于 K，但至少要包含 1 个字符。两个分组之间需要用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
//
//给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
//
//?
//
//示例 1：
//
//输入：S = "5F3Z-2e-9-w", K = 4
//输出："5F3Z-2E9W"
//解释：字符串 S 被分成了两个部分，每部分 4 个字符；
//?    注意，两个额外的破折号需要删掉。
public class LC0087LicenseKeyFormatting {

    //正序插入破折号
    public static String licenseKeyFormatting1(String s, int k) {
        String replace = s.replace("-", "");
        StringBuilder sb = new StringBuilder();
        int len = replace.length();
        if (len<=k){
            return replace.toUpperCase();
        }
        int digital = len%k;
        if (digital>0){
            sb.append(replace.substring(0,digital));
            sb.append("-");
        }
        for (int i = 0; i+k+digital <= len; i=i+k) {
                sb.append(replace.substring(i+digital,i+digital+k));
                if (i+k+digital!=len){
                    sb.append("-");
                }

        }
        return sb.toString().toUpperCase();
    }

    //倒序插入破折号
    public static String licenseKeyFormatting(String s, int k) {
        String replace = s.replace("-", "");
        StringBuilder sb = new StringBuilder(replace);
        int len = replace.length();
        for (int i = len-k; i>=0; i--) {
            if ((len-i)%k==0&&i!=0)
                sb.insert(i,'-');
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        String s1 = licenseKeyFormatting(s, 4);
        System.out.println(s1);
        System.out.println(3%4);
    }
}
