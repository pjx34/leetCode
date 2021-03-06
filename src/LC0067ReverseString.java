import java.util.Arrays;

//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
//
//不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
//
//你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
//
//?
//
//示例 1：
//
//输入：["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
//
public class LC0067ReverseString {
    public static void reverseString1(char[] s) {
        int len = s.length;
        for (int i = 0; i < len/2; i++) {
            int tmp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = (char)tmp;
        }
    }

    public static void reverseString(char[] s) {
        int len = s.length;
        for (int left = 0, right = len-1 ; left < len/2; left++,right--) {
            int tmp = s[left];
            s[left] = s[right];
            s[right] = (char)tmp;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
}
