package com.example.algorithm.dataStructure;

class Node {
    int data;
    Node left;
    Node right;
}
public class Tree {
    public Node root;
    public void setRoot(Node node) {
        this.root = node;
    }
    public Node getRoot() {
        return root;
    }

    public Node makeNode (int data, Node left, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    /**
     * @name inorder
     * @desc travel left, root, right
     * @param node
     */
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    /**
     * @name preorder
     * @desc travel root, left, right
     * @param node
     */
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    /**
     * @name postorder
     * @desc travel left, right, root
     * @param node
     */
    public void postorder(Node node) {
        if (node !=null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    /*
            1
          /   \
         2     3
        / \
       4   5

       Inorder (left, root, right) : 4 2 5 1 3
       Preorder (root, left, right) : 1 2 4 5 3
       Postorder (left, right, root) : 4 5 2 3 1
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node n4 = tree.makeNode(4, null, null);
        Node n5 = tree.makeNode(5, null, null);
        Node n2 = tree.makeNode(2, n4, n5);
        Node n3 = tree.makeNode(3, null, null);
        Node n1 = tree.makeNode(1, n2, n3);
        tree.setRoot(n1);
        tree.inorder(tree.getRoot());
        tree.preorder(tree.getRoot());
        tree.postorder(tree.getRoot());
    }
}
