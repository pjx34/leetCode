package leetcode201_250;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
//
//输入为三个整数：day、month 和?year，分别表示日、月、年。
//
//您返回的结果必须是这几个值中的一个?{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
//示例 1：
//
//输入：day = 31, month = 8, year = 2019
//输出："Saturday"
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
