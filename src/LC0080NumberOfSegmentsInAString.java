//ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
//
//��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
//
//ʾ��:
//
//����: "Hello, my name is John"
//���: 5
//����: ����ĵ�����ָ�����Ĳ��ǿո���ַ������� "Hello," ���� 1 �����ʡ�
//
public class LC0080NumberOfSegmentsInAString {
    public int countSegments(String s) {
        String trim = s.trim();
        if (trim.equals(""))
            return 0;
        String[] split = s.split("\\s+");
        return split.length;
    }

}
