package org.limon.Graphs;

import java.util.LinkedList;

public class GraphImplementation {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public GraphImplementation(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge (int source, int destination) {
        if (source < vertices && destination < vertices) {
            this.adjacencyList[source].addLast(destination);
        }
    }


}
