//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
public class LC0079AddStrings {
    public static String addStrings(String num1, String num2) {
        boolean isOver = false;//是否进位
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        while (p1>=0||p2>=0) {
            if (p1>=0&&p2>=0){
//                int a = (int)(num1.charAt(p1)+"");
//                int b = (int)(num2.charAt(p2)+"");
 //               sb.append(a+b);
            }
            else if (p1>=0&&p2<0)
                sb.append(num1.charAt(p1));
            else if (p2>=0&&p1<0)
                sb.append(num2.charAt(p2));
            p1--;
            p2--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "1234";
        String s2 = "123123";
        String s = addStrings(s1, s2);
        System.out.println(s);
    }
}
