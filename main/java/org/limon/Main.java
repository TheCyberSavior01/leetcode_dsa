package org.limon;

import org.limon.Array.*;
import org.limon.Stack.BaseBallGame;
import org.limon.Stack.ValidParentheses;

public class Main {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "[(])";
        // [(])
        // [(
        System.out.println(validParentheses.isValid(s));
    }
}