package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;
import com.maggioni.BinaryTree.DataStructures.Node;
import java.util.Deque;
import java.util.LinkedList;

public class PreOrderTraversalIterative extends Traversal{

    public PreOrderTraversalIterative(BinaryTree binaryTree) {
        super(binaryTree);
    }

    @Override
    public String BTTraversal() {
        preOrder(binaryTree.getRoot());
        return traversalAttribute.getTraversalString();
    }
    
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        
        Deque<Node> stack = new LinkedList<>();
        stack.push(node);
        
        while (!stack.isEmpty()) {
            node = stack.poll();
            traversalAttribute.addNodeToString(node);
            if (!node.isNodeRightEmpty()) {
                stack.push(node.getRight());
            }
            if (!node.isNodeLeftEmpty()) {
                stack.push(node.getLeft());
            }
        }
    }
    
}
