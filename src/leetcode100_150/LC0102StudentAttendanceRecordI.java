package leetcode100_150;
//����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
//
//'A' : Absent��ȱ��
//'L' : Late���ٵ�
//'P' : Present������
//���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
//
//����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�
//
//ʾ�� 1:
//
//����: "PPALLP"
//���: True
//ʾ�� 2:
//
//����: "PPALLL"
//���: False
public class LC0102StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        if (s.indexOf("A")!=s.lastIndexOf("A"))
            return false;
        if (s.indexOf("LLL")!=-1){
            return false;
        }
        return true;
    }
}
