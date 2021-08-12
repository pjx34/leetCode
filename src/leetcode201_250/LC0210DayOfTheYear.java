package leetcode201_250;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//����һ���� YYYY-MM-DD ��ʽ��ʾ���ڵ��ַ���?date��������㲢���ظ������ǵ���ĵڼ��졣
//
//ͨ������£�������Ϊ 1 �� 1 ����ÿ��ĵ� 1 �죬1 �� 2 ����ÿ��ĵ� 2 �죬�������ơ�ÿ���µ����������й�Ԫ���귨�������������һ�¡�
//ʾ�� 1��
//
//���룺date = "2019-01-09"
//�����9
public class LC0210DayOfTheYear {
    public int dayOfYear(String date) {
        Calendar calendar = Calendar.getInstance();
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date1);
        int i = calendar.get(Calendar.DAY_OF_YEAR);

        return i;

    }
}
