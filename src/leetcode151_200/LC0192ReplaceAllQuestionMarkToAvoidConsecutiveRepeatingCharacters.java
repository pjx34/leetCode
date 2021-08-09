package leetcode151_200;
//����һ��������СдӢ����ĸ�� '?' �ַ����ַ��� s�����㽫���е� '?' ת��Ϊ����Сд��ĸ��ʹ���յ��ַ����������κ� �����ظ� ���ַ���
//
//ע�⣺�� ���� �޸ķ� '?' �ַ���
//
//��Ŀ����������֤ �� '?' �ַ� ֮�⣬�����������ظ����ַ���
//
//���������ת������������ת�����󷵻����յ��ַ���������ж������������뷵�������κ�һ��������֤�����ڸ�����Լ�������£������Ǵ��ڵġ�
//
//?
//
//ʾ�� 1��
//
//���룺s = "?zs"
//�����"azs"
//���ͣ���ʾ������ 25 �ֽ���������� "azs" �� "yzs" ���Ƿ�����ĿҪ��ġ�ֻ�� "z" ����Ч���޸ģ���Ϊ�ַ��� "zzs" ���������ظ������� 'z' ��
public class LC0192ReplaceAllQuestionMarkToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch=='?'){
                char tmp = 'a';
                char left = i>0?chars[i-1]:'0';
                char righ = i<chars.length-1?chars[i+1]:'0';
                while (tmp==left||tmp==righ){
                    tmp = (char)(tmp+1);
                }
                chars[i] = tmp;
            }
        }
        return new String(chars);
    }
}
