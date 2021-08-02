package leetcode151_200;

import java.util.HashMap;

//给你一个字符串?date?，它的格式为?Day Month Year?，其中：
//Day?是集合?{"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}?中的一个元素。
//Month?是集合?{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}?中的一个元素。
//Year?的范围在 ?[1900, 2100]?之间。
//请你将字符串转变为?YYYY-MM-DD?的格式，其中：
//YYYY?表示 4 位的年份。
//MM?表示 2 位的月份。
//DD?表示 2 位的天数。
//示例 1：
//
//输入：date = "20th Oct 2052"
//输出："2052-10-20"
public class LC0157ReformatDate {
    public String reformatDate(String date) {
        String[] months ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <12 ; i++) {
            map.put(months[i],i+1);
        }
        String[] split = date.split(" ");
        int year = Integer.parseInt(split[2]);
        int month = map.get(split[1]);
        int day = Integer.parseInt(split[0].substring(0,split[0].length()-2));
        return String.format("%d-%02d-%02d",year,month,day);
    }
}
