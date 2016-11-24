package com.maggioni.BinaryTree.SearchAlgorithms;

import com.maggioni.BinaryTree.Entities.Node;
import com.maggioni.BinaryTree.Entities.BinaryTree;

public class PreOrderSearch {

    private final BinaryTree binaryTree;
    private final SearchAttribute binaryTreeSearchAttribute = new SearchAttribute();

    public PreOrderSearch(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public String walkTreePreOrder() {
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
