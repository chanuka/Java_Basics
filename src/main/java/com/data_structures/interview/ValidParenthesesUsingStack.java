package com.data_structures.interview;

import java.util.Stack;

public class ValidParenthesesUsingStack {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();

        for (char c : charArr) {
            if ('(' == c || '{' == c || '[' == c) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (')' == c && top == '(' ||
                            '}' == c && top == '{' ||
                            ']' == c && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesesUsingStack vp = new ValidParenthesesUsingStack();
        System.out.println(vp.isValid("{()"));
    }
}
