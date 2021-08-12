package leetcode201_250;
//给你一个有效的 IPv4 地址?address，返回这个 IP 地址的无效化版本。
//
//所谓无效化?IP 地址，其实就是用?"[.]"?代替了每个 "."。
//示例 1：
//
//输入：address = "1.1.1.1"
//输出："1[.]1[.]1[.]1"
public class LC0206DefangingAnIPAddress {

    public String defangIPaddr1(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = address.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!='.'){
                stringBuilder.append(chars[i]);
            }else {
                stringBuilder.append("[.]");
            }
        }
        return stringBuilder.toString();
    }

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
