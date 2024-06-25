package org.limon.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSIterative {
    public void BFS(HashMap<String, List<String>> graph, String source) {
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
