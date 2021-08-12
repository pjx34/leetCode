package leetcode201_250;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//����һ�����ڣ��������һ���㷨���ж����Ƕ�Ӧһ���е���һ�졣
//
//����Ϊ����������day��month ��?year���ֱ��ʾ�ա��¡��ꡣ
//
//�����صĽ���������⼸��ֵ�е�һ��?{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}��
//ʾ�� 1��
//
//���룺day = 31, month = 8, year = 2019
//�����"Saturday"
public class LC0213DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        String s = year + "-"+month+"-"+day;
        Calendar calendar = Calendar.getInstance();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        String[] strings = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return strings[i];
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(18, 7, 1999));
    }
}
