package com.example.algorithm.search;

import com.example.algorithm.dataStructure.Queue;
import com.example.algorithm.dataStructure.Stack;

import java.util.LinkedList;

public class Search {

    /*
         0
        /
        1 -- 3    7
        |  / | \ /
        | /  |  5
        2 -- 4   \
                  6 - 8
     */
    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);

        //dfs(0) : 0 1 3 5 7 6 8 4 2
        //graph.dfs();
        //bfs(0) : 0 1 2 3 4 5 6 7 8
        //graph.bfs();
        //dfs(0) - recursive : 0 1 2 4 3 5 6 8 7
        graph.dfsR(3);

    }
}
class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node (int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];
        for(int i =0; i<size; i++) {
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }
    void bfs() {
        bfs(0);
    }

    /**
     * queue ?????? FIFO
     * @param index
     */
    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()) {
            //queue?????? ???????????? ?????? ?????? ??? ?????? ???????????? ??????????????? ??????
            Node r = queue.remove();
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }

    /**
     * @desc ??????????????? ????????? DFS ??????
     * @param node
     */
    void dfsR(Node node) {
        if (node == null) return;
        node.marked = true;
        visit(node);
        for (Node n : node.adjacent) {
            if (n.marked == false) {
                dfsR(n);

            }
        }
    }

    void dfsR(int index) {
        Node r = nodes[index];
        dfsR(r);
    }

    void dfsR() {
        dfsR(nodes[0]);
    }

    void visit(Node node) {
        System.out.print(node.data + " ");
    }
}


