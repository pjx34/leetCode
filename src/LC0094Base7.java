//给定一个整数，将其转化为7进制，并以字符串形式输出。
//
//示例 1:
//
//输入: 100
//输出: "202"
public class LC0094Base7 {

    public String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        if (num == 0)
            return "0";
        boolean isNagative = num<0;
        num = Math.abs(num);
        while (num!=0){
            sb.append(num%7);
            num = num/7;
        }
        if (isNagative)
            sb.append("-");
        return sb.reverse().toString();
    }

}
