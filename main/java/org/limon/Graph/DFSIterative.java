package org.limon.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DFSIterative {
    public void DFS(HashMap<String, List<String>> graph, String source) {
        Stack<String> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            System.out.println(current);
            List<String> neighbors = graph.get(current);
            for (String neighbor : neighbors) {
                stack.push(neighbor);
            }
        }
    }
}
