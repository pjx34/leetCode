////设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
////
////        push(x) —— 将元素 x 推入栈中。
////        pop() —— 删除栈顶的元素。
////        top() —— 获取栈顶元素。
////        getMin() —— 检索栈中的最小元素。
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class LC0035最小栈 {
//    class MinStack {
//        int min = Integer.MAX_VALUE;
//        Stack mainStack;
//        Stack supportStack;
//
//        /** initialize your data structure here. */
//        public MinStack() {
//            mainStack = new Stack<Integer>();
//            supportStack = new Stack<Integer>();
//            supportStack.push(min);
//        }
//
//        public void push(int val) {
//            mainStack.push(val);
//           supportStack.push(Math.min((int)supportStack.peek(), val));
//        }
//
//        public void pop() {
//            mainStack.pop();
//            supportStack.pop();
//        }
//
//        public int top() {
//           return (int)mainStack.peek();
//        }
//
//        public int getMin() {
//            return (int)supportStack.peek();
//        }
//    }
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */
//}
