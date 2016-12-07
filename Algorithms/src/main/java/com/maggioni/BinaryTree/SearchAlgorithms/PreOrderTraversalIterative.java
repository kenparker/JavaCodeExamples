package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.BinaryTree;
import com.maggioni.BinaryTree.Entities.Node;
import java.util.Deque;
import java.util.LinkedList;

public class PreOrderTraversalIterative extends Traversal{

    public PreOrderTraversalIterative(BinaryTree binaryTree) {
        super(binaryTree);
    }

    @Override
    public String BTTraversal() {
        preOrder(binaryTree.getRoot());
        return binaryTreeWalkAttribute.getWalkString();
    }
    
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        
        Deque<Node> stack = new LinkedList<>();
        stack.push(node);
        
        while (!stack.isEmpty()) {
            node = stack.poll();
            binaryTreeWalkAttribute.addNodeToString(node);
            if (!node.isNodeRightEmpty()) {
                stack.push(node.getRight());
            }
            if (!node.isNodeLeftEmpty()) {
                stack.push(node.getLeft());
            }
        }
    }
    
}
