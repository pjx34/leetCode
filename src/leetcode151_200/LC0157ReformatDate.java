package leetcode151_200;

import java.util.HashMap;

//����һ���ַ���?date?�����ĸ�ʽΪ?Day Month Year?�����У�
//Day?�Ǽ���?{"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}?�е�һ��Ԫ�ء�
//Month?�Ǽ���?{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}?�е�һ��Ԫ�ء�
//Year?�ķ�Χ�� ?[1900, 2100]?֮�䡣
//���㽫�ַ���ת��Ϊ?YYYY-MM-DD?�ĸ�ʽ�����У�
//YYYY?��ʾ 4 λ����ݡ�
//MM?��ʾ 2 λ���·ݡ�
//DD?��ʾ 2 λ��������
//ʾ�� 1��
//
//���룺date = "20th Oct 2052"
//�����"2052-10-20"
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
