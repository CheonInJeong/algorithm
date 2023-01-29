package com.example.algorithm.search;

import com.example.algorithm.dataStructure.Node;
import com.example.algorithm.dataStructure.Queue;
import com.example.algorithm.dataStructure.Graph;
public class BFS {
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

        /*
            0 1 2 3 4 5 6 7 8
         */
        bfs(graph.getNode(0));
    }


    public static void bfs(Node root) {
        Queue<Node> queue = new Queue<>();
        queue.add(root);
        root.setMarked(true);
        while(!queue.isEmpty()) {
            Node r = queue.remove();
            for (Node n : r.getAdjacent()) {
                if (n.isMarked() == false) {
                    n.setMarked(true);
                    queue.add(n);
                }
            }
            System.out.print(r.getData() + " ");
        }

    }
}
