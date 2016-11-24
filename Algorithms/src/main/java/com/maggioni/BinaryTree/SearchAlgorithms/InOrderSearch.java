package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.Node;
import com.maggioni.BinaryTree.Entities.BinaryTree;
import java.util.Deque;
import java.util.LinkedList;

public class InOrderSearch {
    
    final private BinaryTree binaryTree;
    private final SearchAttribute binaryTreeSearchAttribute = new SearchAttribute();
    private final Deque<Node> stack = new LinkedList<>();

    public InOrderSearch(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public String walkTreeInOrder() {
        Node node = binaryTree.getRoot();
        do {
            walkDownTheTree(node);
            node = walkUpTheTree(node);
        } while (node != null || !stack.isEmpty());

        return binaryTreeSearchAttribute.getWalkTheTreeString();
    }

    private Node walkUpTheTree(Node node) {
        node = stack.poll();
        binaryTreeSearchAttribute.addNodeToString(node);
        node = node.getRight();
        return node;
    }

    private void walkDownTheTree(Node node) {
        while (node != null) {
            stack.push(node);
            if (!node.isNodeLeftEmpty()) {
                node = node.getLeft();
            } else {
                node = null;
            }
        }
    }
}
