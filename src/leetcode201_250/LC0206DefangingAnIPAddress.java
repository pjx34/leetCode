package leetcode201_250;
//����һ����Ч�� IPv4 ��ַ?address��������� IP ��ַ����Ч���汾��
//
//��ν��Ч��?IP ��ַ����ʵ������?"[.]"?������ÿ�� "."��
//ʾ�� 1��
//
//���룺address = "1.1.1.1"
//�����"1[.]1[.]1[.]1"
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
