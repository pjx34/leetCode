import java.util.ArrayList;
import java.util.List;

//дһ����������� 1 �� n ���ֵ��ַ�����ʾ��
//
//1. ���?n?��3�ı����������Fizz����
//
//2. ���?n?��5�ı����������Buzz����
//
//3.���?n?ͬʱ��3��5�ı�������� ��FizzBuzz����
//
public class LC0077FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i<=2||i==4){
                list.add(Integer.toString(i));
            }else {
                if (i%3==0&&i%5==0) {
                    list.add("FizzBuzz");
                    continue;
                }
                else if(i%3==0){
                    list.add("Fizz");
                    continue;
                }else if (i%5==0){
                    list.add(("Buzz"));
                    continue;
                }else {
                    list.add(Integer.toString(i));
                    continue;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = fizzBuzz(5);
        System.out.println(strings);
        System.out.println(3%3);
    }
}
