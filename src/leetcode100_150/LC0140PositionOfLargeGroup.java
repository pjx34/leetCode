package leetcode100_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//��һ����Сд��ĸ���ɵ��ַ��� s �У�������һЩ��������ͬ�ַ������ɵķ��顣
//���磬���ַ��� s = "abbxxxxzyy"?�У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣
//������������� [start, end] ��ʾ������ start �� end �ֱ��ʾ�÷������ʼ����ֹλ�õ��±ꡣ�����е� "xxxx" �����������ʾΪ [3,6] ��
//���ǳ����а������ڻ�������������ַ��ķ���Ϊ �ϴ���� ��
//�ҵ�ÿһ�� �ϴ���� �����䣬����ʼλ���±����˳������󣬷��ؽ����
//ʾ��?1��
//
//���룺s = "abbxxxxzzy"
//�����[[3,6]]
//���ͣ�"xxxx" ��һ����ʼ�� 3 ����ֹ�� 6 �Ľϴ���顣
public class LC0140PositionOfLargeGroup {
    public static List<List<Integer>> largeGroupPositions1(String s) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i+=count) {
            char ch = s.charAt(i);//a,b,c,d,d,d,e,e,e,e,a,a,b,b,b,c,d
            count = 0;
            StringBuilder sb = new StringBuilder();
            while (i+count<=s.length()&&s.substring(i,i+count).indexOf(sb.toString())!=-1){
                sb.append(ch);
                count++;
            }
            if (count>3){
                count--;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(i+count-1);
                lists.add(list);
            }else{
                count = 1;
            }
        }
        return lists;
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length();
        int num = 1;
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i+1>=len||s.charAt(i)!=s.charAt(i+1)){
                if (num>=3){
                    lists.add(Arrays.asList(i-num+1,i));
                }
               num = 1;
            }else{
                num++;
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        String s = "aaaabbb";
        List<List<Integer>> lists = largeGroupPositions(s);
        System.out.println(lists);
    }
}
