package com.example.algorithm.search;

import com.example.algorithm.dataStructure.Graph;
import com.example.algorithm.dataStructure.Node;
import com.example.algorithm.dataStructure.Stack;

public class DFS {
    public static void main(String[] args) {
    /*
         0
        /
        1 -- 3    7
        |  / | \ /
        | /  |  5
        2 -- 4   \
                  6 - 8
     */
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

        //dfs(graph.getNode(0));
        dfsR(graph.getNode(0));

    }

    /*
        0 1 3 5 7 6 8 4 2
     */
    public static void dfs(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.setMarked(true);
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.getAdjacent()) {
                if (n.isMarked() == false) {
                    n.setMarked(true);
                    stack.push(n);
                }
            }
            System.out.print(r.getData() + " ");
        }
    }
    /*
         0 1 2 3 4 5 6 8 7
     */
    public static void dfsR(Node node) {
        if (node == null) return;
        node.setMarked(true);
        System.out.println(node.getData());
        for (Node n : node.getAdjacent()) {
            if (n.isMarked() == false) {
                dfsR(n);
            }
        }

    }
}
