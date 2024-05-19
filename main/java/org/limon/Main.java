package org.limon;

import org.limon.Array.*;
import org.limon.Stack.BaseBallGame;

public class Main {
    public static void main(String[] args) {
        BaseBallGame baseBallGame = new BaseBallGame();
        String[] test1 = new String[] {"5","2","C","D","+"};
        String[] test2 = new String[] {"5","-2","4","C","D","9","+","+"};
        String[] test3 = new String[] {"1","C"};
        System.out.println(baseBallGame.calPoints(test3));
    }
}