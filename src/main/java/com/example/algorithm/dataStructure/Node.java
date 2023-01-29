package com.example.algorithm.dataStructure;

import java.util.LinkedList;

public class Node {
    private int data;
    private LinkedList<Node> adjacent;
    private boolean marked;
    public Node (int data) {
        this.data = data;
        this.marked = false;
        adjacent = new LinkedList<Node>();
    }

    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return this.data;
    }

    public LinkedList<Node> getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(LinkedList<Node> adjacent) {
        this.adjacent = adjacent;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }
}
