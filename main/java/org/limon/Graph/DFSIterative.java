package org.limon.Graph;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFSIterative {
    public void dfsGraph(Map<String, List<String>> graph, String source) {
        Stack<String> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            System.out.println(current);
            for (String neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }
    }
}
