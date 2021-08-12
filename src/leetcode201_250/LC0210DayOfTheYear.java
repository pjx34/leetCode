package leetcode201_250;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//给你一个按 YYYY-MM-DD 格式表示日期的字符串?date，请你计算并返回该日期是当年的第几天。
//
//通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
//示例 1：
//
//输入：date = "2019-01-09"
//输出：9
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
