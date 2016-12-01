package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.BinaryTree;
import com.maggioni.BinaryTree.Entities.Node;
import java.util.Deque;
import java.util.LinkedList;

public class PostOrderTraversalIterative extends Traversal {

    private Deque<Node> stack = new LinkedList<>();
    private Node previous;
    private Node current;

    public PostOrderTraversalIterative(BinaryTree binaryTree) {
        super(binaryTree);
    }

    @Override
    public String BTTraversal() {
        preOrderTraversalIterative(binaryTree.getRoot());
        return binaryTreeSearchAttribute.getWalkTheTreeString();
    }

    private void preOrderTraversalIterative(Node root) {
        if (root == null) {
            return;
        }

        stack.push(root);
        previous = root;
        while (!stack.isEmpty()) {
            current = stack.peek();
            if (current.isParent(previous)) {
                traverseDown();
            } else if (currentLeftIsPrevious()) {
                traverseUpFromLeft();
            } else if (currentRightIsPrevious()) {
                addNodeToString();
            }
            previous = current;
        }
    }

    private boolean currentRightIsPrevious() {
        return !objectIsNull(current.getRight()) && current.getRight().equals(previous);
    }

    private boolean currentLeftIsPrevious() {
        return current.getLeft() != null && current.getLeft().equals(previous);
    }

    private void traverseDown() {
        
        if (current.isEndNode()) {
            addNodeToString();
            return;
        }
        if (current.getLeft() != null) {
            stack.push(current.getLeft());
        } else if (current.getRight() != null) {
            stack.push(current.getRight());
        }
    }

    private void traverseUpFromLeft() {
        if (current.getRight() != null) {
            stack.push(current.getRight());
        } else {
            addNodeToString();
        }
    }

    private void addNodeToString() {
        this.binaryTreeSearchAttribute.addNodeToString(current);
        stack.pop();
    }
    
    private boolean objectIsNull(Object object) {
        return object == null;
    }

}
