package org.limon.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {
    public List<Integer> bfsForGraph(Graph graph, int souce) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.getVertices()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(souce);
        visited[souce] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            result.add(currentVertex);

            LinkedList<Integer> temp = graph.adjacencyList[currentVertex];
            while (!temp.isEmpty()) {
                if (!visited[temp.peek()]) {
                    queue.add(temp.peek());
                    visited[temp.peek()] = true;
                }
                temp.poll();
            }
        }


        return result;
    }
}
