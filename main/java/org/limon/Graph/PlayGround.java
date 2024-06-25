package org.limon.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayGround {

    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
                "a", List.of("c", "b"),
                "b", List.of("d"),
                "c", List.of("e"),
                "d", List.of(),
                "e", List.of()
        );

//        DFSIterative dfsIterative = new DFSIterative();
//        dfsIterative.dfsGraph(graph, "a");

        BFSIterative bfsIterative = new BFSIterative();
        bfsIterative.BFS(graph, "a");

    }
}
