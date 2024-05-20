package org.limon.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        // [(])
        // [(]

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c).equals(stack.peek())) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
