package org.limon.Graphs;

import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    // constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // add edges
    public void addEdge(int source, int destination) {
        adjacencyList[source].addLast(destination);
    }


}
