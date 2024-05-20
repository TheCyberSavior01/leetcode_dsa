package org.limon.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        HashMap<Character, Character> map = new HashMap();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.remove(map.get(c));
            } else {
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }
}
