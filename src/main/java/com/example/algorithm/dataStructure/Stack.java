package com.example.algorithm.dataStructure;

import java.util.NoSuchElementException;

public class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    public void push(T data) {
        Node<T> t = new Node<>(data);
        t.next = top;
        top = t;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
