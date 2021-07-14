import java.util.HashMap;
import java.util.Stack;

//leetCode00006 有效的括号
//        s = "()"
//        输出：true
//        示例 2：
//
//        输入：s = "()[]{}"
//        输出：true
//        示例 3：
//
//        输入：s = "(]"
//        输出：false
//        示例 4：
//
//        输入：s = "([)]"
//        输出：false
//        示例 5：
//
//        输入：s = "{[]}"
//        输出：true
public class LeetCode0006 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if (s.startsWith(")")||s.startsWith("]")||s.startsWith("}"))
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
                continue;
            }
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty()){
                    return false;
                }else{
                    Character pop = stack.pop();
                    if (pop != map.get(s.charAt(i))){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty()?true:false;
    }

//    public boolean isValid(String s) {
//        if (s.startsWith(")")||s.startsWith("]")||s.startsWith("}"))
//            return false;
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
//                stack.push(s.charAt(i));
//                continue;
//            }
//            if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
//                if (!stack.isEmpty()){
//                    Character pop = stack.pop();
//                    if (pop == '('&& s.charAt(i)!=')'||pop == '['&& s.charAt(i)!=']'||pop == '{'&& s.charAt(i)!='}')
//                        return false;
//                }else{
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty()?true:false;
//    }
}
