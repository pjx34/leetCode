import java.util.Stack;

public class LeetCode0034MinStack {
    class MinStack {

        int min = Integer.MAX_VALUE;

        Stack stack = new Stack<Integer>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int val) {
            stack.push(val);
            if (val<min)
                min = val;
        }

        public void pop() {

        }

        public int top() {

        }

        public int getMin() {

        }
    }
}
