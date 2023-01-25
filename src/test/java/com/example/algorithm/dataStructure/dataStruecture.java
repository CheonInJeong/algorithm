package com.example.algorithm.dataStructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class dataStruecture {

    @Test
    public void queue() {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        Assertions.assertEquals(1, queue.remove());
        Assertions.assertEquals(2, queue.remove());
        Assertions.assertEquals(3, queue.peek());
        Assertions.assertEquals(3, queue.remove());
        Assertions.assertEquals(false, queue.isEmpty());
        Assertions.assertEquals(4, queue.remove());
        Assertions.assertEquals(true, queue.isEmpty());
    }

    @Test
    public void stack() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        Assertions.assertEquals(4, s.pop());
        Assertions.assertEquals(3, s.pop());
        Assertions.assertEquals(2, s.peek());
        Assertions.assertEquals(2, s.pop());
        Assertions.assertEquals(false, s.isEmpty());
        Assertions.assertEquals(1, s.pop());
        Assertions.assertEquals(true, s.isEmpty());
    }

}
