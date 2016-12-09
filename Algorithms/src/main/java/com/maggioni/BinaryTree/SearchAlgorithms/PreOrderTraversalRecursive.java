package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.DataStructures.BinaryTree;
import com.maggioni.BinaryTree.DataStructures.Node;

public class PreOrderTraversalRecursive extends Traversal{
    
    public PreOrderTraversalRecursive(BinaryTree binaryTree) {
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
        traversalAttribute.addNodeToString(node);
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }   
}
