package com.example.algorithm.dataStructure;

public class Graph {
    public Node[] nodes;
    public Graph (int size) {
        nodes = new Node[size];
        for(int i =0; i<size; i++) {
            nodes[i] = new Node(i);
        }
    }
    public void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.getAdjacent().contains(n2)) {
            n1.getAdjacent().add(n2);
        }
        if (!n2.getAdjacent().contains(n1)) {
            n2.getAdjacent().add(n1);
        }
    }
    public Node getNode(int i) {
        return this.nodes[i];
    }
}
