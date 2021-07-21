import java.util.ArrayList;
import java.util.List;

//写一个程序，输出从 1 到 n 数字的字符串表示。
//
//1. 如果?n?是3的倍数，输出“Fizz”；
//
//2. 如果?n?是5的倍数，输出“Buzz”；
//
//3.如果?n?同时是3和5的倍数，输出 “FizzBuzz”。
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
