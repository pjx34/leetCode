package leetcode100_150;
//����һ���ɿո�ָ�ʵľ���?S��ÿ������ֻ������д��Сд��ĸ��
//����Ҫ������ת��Ϊ?��Goat Latin����һ�������� ��������?- Pig Latin ���鹹���ԣ���
//ɽ�������ĵĹ������£�
//���������Ԫ����ͷ��a, e, i, o, u�����ڵ��ʺ����"ma"��
//���磬����"apple"��Ϊ"applema"��
//��������Ը�����ĸ��ͷ������Ԫ����ĸ�����Ƴ���һ���ַ��������ŵ�ĩβ��֮�������"ma"��
//���磬����"goat"��Ϊ"oatgma"��
//���ݵ����ھ����е��������ڵ�����������������ͬ��������ĸ'a'��������1��ʼ��
//���磬�ڵ�һ�����ʺ����"a"���ڵڶ������ʺ����"aa"���Դ����ơ�
//���ؽ�?S?ת��Ϊɽ�������ĺ�ľ��ӡ�
//ʾ�� 1:
//����: "I speak Goat Latin"
//���: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
public class LC0139GoatLatin {
    public static String toGoatLatin(String sentence) {
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (isStartWithAEIOU(strings[i]))
                sb.append(strings[i]+"ma");
            else if (!isStartWithAEIOU(strings[i])){
                sb.append(strings[i].substring(1)+strings[i].charAt(0)+"ma");
            }
            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }
            sb.append(" ");

        }
        return sb.toString().trim();
    }

    public static boolean isStartWithAEIOU(String s){
        return s.startsWith("a")||s.startsWith("e")||s.startsWith("i")||s.startsWith("o")||s.startsWith("u")||
                s.startsWith("A")||s.startsWith("E")||s.startsWith("I")||s.startsWith("O")||s.startsWith("U");
    }

    public static void main(String[] args) {
        String a = "I speak Goat Latin";
        String s = toGoatLatin(a);
        System.out.println(s);
    }
}
