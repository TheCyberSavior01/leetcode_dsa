package org.limon;

import org.limon.Array.*;
import org.limon.Stack.BaseBallGame;
import org.limon.Stack.MinimumStack;
import org.limon.Stack.ValidParentheses;

public class Main {
    public static void main(String[] args) {
        MinimumStack minimumStack = new MinimumStack();
        minimumStack.push(-2);
        minimumStack.push(-2);
        minimumStack.push(-3);
        minimumStack.push(-3);
        System.out.println(minimumStack.getMin()); // return 0
        minimumStack.pop();
        //System.out.println(minimumStack.top());    // return 2
        System.out.println(minimumStack.getMin());
        // -2, -2, -3, -3
        // -2, -2, -3, -3
        // 3
    }
}