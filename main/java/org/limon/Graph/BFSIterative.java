package org.limon.Graph;

import java.util.*;

public class BFSIterative {
    public void BFS(Map<String, List<String>> graph, String source) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            System.out.println(cur);
            List<String> neighbors = graph.get(cur);
            for (String neighbor : neighbors) {
                queue.offer(neighbor);
            }
        }
    }
}
