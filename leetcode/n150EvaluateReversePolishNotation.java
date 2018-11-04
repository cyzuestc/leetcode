package leetcode;

import java.util.Stack;

public class n150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                case "-":
                    stack.push(-(stack.pop()-stack.pop()));
                case "*":
                    stack.push(stack.pop()*stack.pop());
                case "/":
                    int temp = stack.pop();
                    stack.push(stack.pop()/temp);
                default:stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
