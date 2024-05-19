package org.limon.Stack;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        List<Integer> result = new ArrayList<>();
        int res = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                res += result.get((result.size() -1)) + result.get((result.size() -2));
                result.add(result.get((result.size() -1)) + result.get((result.size() -2)));
            } else if (operations[i].equals("D")) {
                res += result.get((result.size() -1)) * 2;
                result.add(result.get((result.size() -1)) * 2);
            } else if (operations[i].equals("C")) {
                res -= result.get(result.size() - 1);
                result.remove(result.size() - 1);
            } else {
                res += Integer.parseInt(operations[i]);
                result.add(Integer.parseInt(operations[i]));
            }
        }

        return res;

    }


}
