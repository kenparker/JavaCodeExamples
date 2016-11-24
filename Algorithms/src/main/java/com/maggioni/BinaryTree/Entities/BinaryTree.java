package com.maggioni.BinaryTree.Entities;

import java.util.Deque;
import java.util.LinkedList;

public class BinaryTree {

    private Node root;

    private final Deque<Node> stack = new LinkedList<>();

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public boolean find(Node node2) {
        Node node1 = root;
        while (!node1.equals(node2)) {
            node1 = selectNodePreOrder(node1);
        }
        return true;
    }

    Node selectNodePreOrder(Node node) {
        if (!node.isNodeRightEmpty()) {
            stack.push(node.getRight());
        }
        if (!node.isNodeLeftEmpty()) {
            return node.getLeft();
        }
        return stack.poll();
    }

}
