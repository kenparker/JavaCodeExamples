package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.BinaryTree;
import com.maggioni.BinaryTree.Entities.Node;

public class PreOrderTraversalRecursive extends Traversal{
    
    public PreOrderTraversalRecursive(BinaryTree binaryTree) {
        super(binaryTree);
    }
       
    @Override
    public String BTTraversal() {
        preOrder(binaryTree.getRoot());
        return binaryTreeSearchAttribute.getWalkTheTreeString();
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        binaryTreeSearchAttribute.addNodeToString(node);
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }   
}
