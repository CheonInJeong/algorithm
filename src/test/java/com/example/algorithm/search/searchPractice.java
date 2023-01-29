package com.example.algorithm.search;

import com.example.algorithm.dataStructure.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class searchPractice {

    @Test
    public void Q1() {
           /*
         0
        /
        1 -- 3    7
        |  / |  /
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
        //graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);

        graph.initMark();

        boolean result = Practice.search(graph.getNode(0), graph.getNode(5));
        Assertions.assertEquals(false, result);

    }
}
