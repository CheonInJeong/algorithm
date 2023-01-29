package com.example.algorithm.search;

import com.example.algorithm.dataStructure.Node;

import java.util.LinkedList;

public class Practice {
    /*
        Q1. 그래프에서 두개의 노드가 서로 찾아 갈 수 있는 경로가 서로 찾아 갈 수 있는 경로가 있는지 확인하는 함수를 구현하라
            -> BFS 가 적합. 시작점을 기준으로 조금씩 영역을 넓혀가면서 찾는게 빠를 것 같다고 생각.
     */

    public static boolean search(Node start, Node end) {
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(start);
        while(!queue.isEmpty()) {
            Node root = queue.removeFirst();
            if (root == end) {
                return true;
            }
            for (Node n : root.getAdjacent()) {
                if (n.isMarked() == false) {
                    n.setMarked(true);
                    queue.add(n);
                }
            }
        }
        return false;
    }
}
