package leetcode201_250;

import java.util.Stack;

//������Сд��ĸ��ɵ��ַ���?S���ظ���ɾ��������ѡ��������������ͬ����ĸ����ɾ�����ǡ�
//�� S �Ϸ���ִ���ظ���ɾ��������ֱ���޷�����ɾ����
//����������ظ���ɾ�������󷵻����յ��ַ������𰸱�֤Ψһ��
//ʾ����
//
//���룺"abbaca"
//�����"ca"
//���ͣ�
//���磬�� "abbaca" �У����ǿ���ɾ�� "bb" ��������ĸ��������ͬ�����Ǵ�ʱΨһ����ִ��ɾ���������ظ��֮�����ǵõ��ַ��� "aaca"��������ֻ�� "aa" ����ִ���ظ���ɾ�����������������ַ���Ϊ "ca"��
public class LC0201RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        char[] chars = s.toCharArray();
        int top = -1;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (top>=0&&ch==stack.charAt(top)){
                stack.deleteCharAt(top);
                top--;
            }else{
                stack.append(ch);
                top++;
            }
        }
        return stack.toString();
    }
}
